import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int maxOperations = Integer.MAX_VALUE;
        
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            int num = arr[i];
            
            while (num % 2 == 0) {
                num /= 2;
                count++;
            }
            
            maxOperations = Math.min(maxOperations, count);
        }
        
        System.out.println(maxOperations);
        
        scanner.close();
    }
}
