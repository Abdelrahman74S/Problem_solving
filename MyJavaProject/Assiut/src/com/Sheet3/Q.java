import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = input.nextInt();
            int[] src = new int[N];

            for (int i = 0; i < N; i++) {
                src[i] = input.nextInt();
            }

            int c = 0; 
            
            for (int i = 0; i < N; i++) {
                for (int j = i; j < N; j++) {
                    boolean isNonDecreasing = true;

                    for (int k = i; k < j; k++) { 
                        if (src[k] > src[k + 1]) {
                            isNonDecreasing = false;
                            break;
                        }
                    }

                    if (isNonDecreasing) {
                        c++;
                    }
                }
            }

            System.out.println(c);
        }

        input.close();
    }
}
