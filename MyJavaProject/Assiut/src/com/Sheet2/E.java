
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
            int n =Input.nextInt();
            int i=0;
            long max =Long.MIN_VALUE;
            while (i<n) {
              long x =Input.nextLong();
               max = x > max ? x : max;
                i++;
            }
            System.out.println(max);
        }
    }
}
