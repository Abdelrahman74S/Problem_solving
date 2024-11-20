import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        long[] fibArray = new long[N];

        if (N >= 1) {
            fibArray[0] = 0; 
        }
        if (N >= 2) {
            fibArray[1] = 1; 
        }

        for (int i = 2; i < N; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        System.out.println(fibArray[N - 1]);

        input.close();
    }
}
