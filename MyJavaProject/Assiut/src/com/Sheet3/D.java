import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] =Input.nextInt();
             if(arr[i] <= 10){
                System.out.printf("A[%d] = %d\n",i,arr[i]);
             }
        }

        Input.close();
    }
}
