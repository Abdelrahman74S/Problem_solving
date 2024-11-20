import java.util.Scanner;

public class J {
    
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int T = Input.nextInt();
        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = Input.nextInt();
        }

        int count = 0;

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < T; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                    break; 
                }
            }
        }

        if (count % 2 == 0) {
            System.out.println("Lucky");
        } else {
            System.out.println("Unlucky");
        }

        Input.close();
    }
}
