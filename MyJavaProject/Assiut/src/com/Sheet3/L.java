import java.util.Scanner;
     
public class L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int T = input.nextInt();
 
        for (int t = 0; t < T; t++) {
            int N = input.nextInt();
            int[] src = new int[N];
 
            for (int i = 0; i < N; i++) {
                src[i] = input.nextInt();
            }
 
            for (int i = 0; i < N; i++) {
 
                for (int j = i; j < N; j++) {
 
                    int max = src[i]; 
                    
                    for (int k = i; k <= j; k++) {
                        
                        if (src[k] > max) {
                            max = src[k]; 
                        }
                    }
                    System.out.print(max + " ");
                }
            }
 
            System.out.println();
        }
 
        input.close();
    }
}