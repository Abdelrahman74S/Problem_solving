import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] =Input.nextInt();
        }

        boolean isPalindrome = true;

        for (int i = 0; i < n / 2; i++) {
            int end = n - i - 1;
            if (arr[i] != arr[end]) {
                isPalindrome = false;
                break; 
            }
        }

        if(isPalindrome){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        Input.close();
    }
}
