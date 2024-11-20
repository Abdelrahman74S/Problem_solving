import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String S = input.nextLine();
        String T = input.nextLine();

        if (S.compareTo(T) <= 0) {
            System.out.println(S); 
        } else {
            System.out.println(T); 
        }

        input.close();
    }
}
