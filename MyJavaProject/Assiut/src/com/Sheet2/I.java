import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long N = scanner.nextLong();
            long original = N;
            long  reversed = 0;
            
            while (N > 0) {
                long digit = N % 10;
                reversed = reversed * 10 + digit;  
                N /= 10;  
            }
            
            System.out.println(reversed);
            
            if (original == reversed) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
