import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] =Input.nextInt();
        }

        Input.close();
    }
}
