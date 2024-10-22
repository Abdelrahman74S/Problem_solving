import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt(); 
        
        for (int i = 0; i < T; i++) {
            long N = input.nextLong(); 
            
            if (N == 0) {
                System.out.println("0");
            } else {
                while (N > 0) {
                    System.out.print(N % 10); 
                    N /= 10; 
                    
                    if (N > 0) {
                        System.out.print(" "); 
                    }
                }
                System.out.println(); 
            }
        }

        input.close();
    }
}
