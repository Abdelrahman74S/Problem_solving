import java.util.Scanner;

public class S {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    int m = input.nextInt();

    int arr[][] = new int[n][m];
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            arr[i][j] =input.nextInt();
        }
    }

    int x =input.nextInt();

    boolean isexist =false;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if(arr[i][j] == x){
                isexist =true;
                break;
            }
        }
        if (isexist) {
            break;  
        }
    }

    if (isexist) {
        System.out.println("will not take number");
    }else{
        System.out.println("will take number");
    }

    input.close();
  }    
}
