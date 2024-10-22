
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        
        for (int i = 2; i <= x; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) { 
                if (i % j == 0) {
                    isPrime = false;
                    break; 
                }
            }
            if (isPrime) {
                System.out.print(i + " "); 
            }
        }
        
        scanner.close(); 
    }
}
