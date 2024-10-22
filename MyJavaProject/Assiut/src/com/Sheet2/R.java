import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            while (true) {
                int N =input.nextInt();
                int M =input.nextInt();
                
                if (N <= 0 || M <= 0) {
                    break;
                }

                int min = Math.min(N, M); 
                int max = Math.max(N, M); 
                int sum =0;

                for (int i = min; i <= max; i++) {
                 
                 System.out.print(i + " ");
                   sum +=i;

                }
                System.out.printf("sum =%d\n",sum);

            }

        }
    }
}

