import java.util.Scanner;

public class Y {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); 

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(a);
            } else if (i == 2) {
                System.out.print(" " + b);
            } else {
                int next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
            }
        }

        System.out.println(); 
        input.close();
    }
}
