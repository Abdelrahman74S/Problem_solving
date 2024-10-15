import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)){
            int a =Input.nextInt();
            int b =Input.nextInt();
            String s = a >= b ? "Yes" : "No" ;
            System.out.println(s);
        }
    }
}
