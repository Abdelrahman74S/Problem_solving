import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int x = input.nextInt();
            char s = input.next().charAt(0); 
            int y = input.nextInt();
            
            boolean isCorrect = false;

            switch (s) {
                case '<':
                    isCorrect = x < y;
                    break;
                case '>':
                    isCorrect = x > y;
                    break;
                case '=':
                    isCorrect = x == y;
                    break;
                default:
                    System.out.println("Invalid comparison symbol.");
                    return; 
            }

            System.out.println(isCorrect ? "Right" : "Wrong");
        }
    }
}
