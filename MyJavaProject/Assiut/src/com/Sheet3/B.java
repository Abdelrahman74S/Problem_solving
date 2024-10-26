import java.util.Scanner;

public class B {
   public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);

    int n =Input.nextInt();
    int []arr =new int[n];
    int f=-1;

    for (int i = 0; i < n; i++) {
        arr[i] = Input.nextInt();
    }
    
    int x =Input.nextInt();
    for (int i = 0; i < n; i++) {
        if(arr[i] == x){
            f =i;
            break;
        }
    }
        System.out.println(f);
    Input.close();
   } 
}
