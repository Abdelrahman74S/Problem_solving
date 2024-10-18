import java.util.Scanner;

public class DigitsSummation {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
            long a = Input.nextLong();
            long b = Input.nextLong();
            long x = (a % 10) + (b % 10);
            System.out.println(x);


        }

    }
}
