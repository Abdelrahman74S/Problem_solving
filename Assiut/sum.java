import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)) {
            long a = Input.nextLong();
            long x = (a* (a +1)) /2; 
            System.out.println(x);
         }
    }
}
