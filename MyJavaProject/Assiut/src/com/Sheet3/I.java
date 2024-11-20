import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int T = Input.nextInt();

        for (int i = 0; i < T; i++) {
            int n = Input.nextInt();
            int[] arr = new int[n]; 

            for (int j = 0; j < n; j++) {
                arr[j] = Input.nextInt();
            }

            int min = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int b = arr[j] + arr[k] + (k - j);
                    if (b < min) {
                        min = b; 
                    }
                }
            }

            System.out.println(min); 
        }

        Input.close(); 
    }
}
