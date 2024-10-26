import java.util.Scanner;

public class E {
public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    int n = Input.nextInt();
    int []arr = new int[n];
    
    int min = Integer.MAX_VALUE;
    int b=0,f =-1;

    for (int i = 0; i < n; i++) {
        arr[i] =Input.nextInt();
        if (arr[i] < min) {
            min = arr[i];
            b = arr[i];
            f = i;
        }
    }
        System.out.printf("%d %d",b,f+1);
    Input.close();
}    
}
