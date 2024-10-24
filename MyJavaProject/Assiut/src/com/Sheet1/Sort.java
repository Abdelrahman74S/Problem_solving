import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        input.close();

        // Determine and print the sorted order of A, B, C
        if (A <= B && A <= C) {
            System.out.println(A);
            if (B <= C) {
                System.out.println(B);
                System.out.println(C);
            } else {
                System.out.println(C);
                System.out.println(B);
            }
        } else if (B <= A && B <= C) {
            System.out.println(B);
            if (A <= C) {
                System.out.println(A);
                System.out.println(C);
            } else {
                System.out.println(C);
                System.out.println(A);
            }
        } else {
            System.out.println(C);
            if (A <= B) {
                System.out.println(A);
                System.out.println(B);
            } else {
                System.out.println(B);
                System.out.println(A);
            }
        }

        // Print a blank line
        System.out.println();

        // Print the original numbers in the input order
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
