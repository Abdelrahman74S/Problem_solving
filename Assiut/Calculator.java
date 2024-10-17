import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter an expression (e.g., 7+54):");
            String expression = input.nextLine();

            // Extract the operator and determine its position
            int operatorPos = -1;
            char operator = ' ';
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    operator = ch;
                    operatorPos = i;
                    break;
                }
            }

            // Check if an operator was found
            if (operatorPos == -1) {
                System.out.println("Error: No valid operator found in the expression.");
                return;
            }

            // Extract the operands from the expression
            try {
                long a = Long.parseLong(expression.substring(0, operatorPos).trim());
                long b = Long.parseLong(expression.substring(operatorPos + 1).trim());

                // Perform the operation based on the operator
                switch (operator) {
                    case '+':
                        System.out.println(a + b);
                        break;
                    case '-':
                        System.out.println(a - b);
                        break;
                    case '*':
                        System.out.println(a * b);
                        break;
                    case '/':
                        if (b != 0) {
                            System.out.println(a / b);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format.");
            }
        }
    }
}
