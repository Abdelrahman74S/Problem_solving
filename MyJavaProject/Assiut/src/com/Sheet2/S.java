import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int T =input.nextInt();

               for (int i = 0; i < T; i++) {
                int N =input.nextInt();
                int M =input.nextInt();
                
                int min = Math.min(N, M); 
                int max = Math.max(N, M); 
                int sum =0;
               
                for (int j = min+1; j < max; j++) {
                 if(j % 2 !=0){
                   sum +=j;
                 }
                }
                System.out.println(sum);

            
            }
        }
    }
}

