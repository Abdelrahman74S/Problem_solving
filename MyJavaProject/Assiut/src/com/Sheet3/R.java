import java.util.Scanner;
import java.util.Arrays;

public class R {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        boolean ispermutation =true;

        int [] A =new int[T];
        for (int i = 0; i < T; i++) {
            A[i] = input.nextInt();
        }

        int [] B =new int[T];
        for (int i = 0; i < T; i++) {
            B[i] = input.nextInt();
        }
        Arrays.sort(B);
        Arrays.sort(A);

        for (int i = 0; i < T; i++) {
            if(A[i] != B[i]){
                ispermutation =false;
                break;
            }
        }

        if(ispermutation){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        input.close();
    }
}
