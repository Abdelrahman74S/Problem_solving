import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
    
        int arr[][] = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] =input.nextInt();
            }
        }

        int sumsecondarydiagonal =0;
        int size = arr.length -1;

        for (int i = 0; i < arr.length; i++) {
            sumsecondarydiagonal +=arr[i][size-i];
        }

        int sumprimarydiagonal =0;
        for (int i = 0; i < arr.length; i++) {
            sumprimarydiagonal += arr[i][i];
        }
        int sum = Math.abs(sumprimarydiagonal - sumsecondarydiagonal);

        System.out.println(sum);
        input.close();
    }
}
