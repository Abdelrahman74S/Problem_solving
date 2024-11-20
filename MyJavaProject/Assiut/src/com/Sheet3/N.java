import java.util.Scanner;

public class N {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        input.nextLine(); 

        String S = input.nextLine();

        if (S.length() != A + B + 1) {
            System.out.println("No");
            return;
        }

        if (S.charAt(A) != '-') {
            System.out.println("No");
            return;
        }

        boolean isValid = true;
        for (int i = 0; i < S.length(); i++) {
            if (i != A) { 
                if (!Character.isDigit(S.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
        }

        if (isValid) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        input.close();
    }
}
