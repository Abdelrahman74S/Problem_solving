import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        int [] arr = new int[n];
        int max =Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int maxIndex = -1, minIndex = -1;

        for (int i = 0; i < n; i++) {
            arr[i] =Input.nextInt();

            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " " );
        }

        
        Input.close();
    }
}
