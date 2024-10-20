import java.util.Scanner;

public class sord {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String str = input.next();
            
            if (str.length() == 1) {
                char ch = str.charAt(0);

                if (Character.isDigit(ch)) {
                    System.out.println("IS DIGIT");
                } else if (Character.isAlphabetic(ch)) {
                    System.out.println("ALPHA");
                    if (Character.isUpperCase(ch)) {
                        System.out.println("IS CAPITAL");
                    } else {
                        System.out.println("IS SMALL");
                    }
                }
            }
        }
    }
}

/*import java.util.Scanner;

public class Sord {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String str = input.next();

            // Make sure the input is a single character
            if (str.length() == 1) {
                char ch = str.charAt(0);

                // Check if the character is a digit
                if (ch >= '0' && ch <= '9') {
                    System.out.println("IS DIGIT");
                } 
                // Check if the character is an alphabet
                else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                    System.out.println("ALPHA");
                    // Check if the alphabet is uppercase
                    if (ch >= 'A' && ch <= 'Z') {
                        System.out.println("IS CAPITAL");
                    } 
                    // Otherwise, it must be lowercase
                    else {
                        System.out.println("IS SMALL");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an alphanumeric character.");
                }
            } else {
                System.out.println("Invalid input. Please enter a single character.");
            }
        }
    }
}
 */