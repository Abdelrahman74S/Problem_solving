import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }

        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = input.nextInt();
        }

        int j = 0; 
        for (int i = 0; i < N && j < M; i++) {
            if (A[i] == B[j]) {
                j++;
            }
        }

        if (j == M) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        input.close();
    }
}
