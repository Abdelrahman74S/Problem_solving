import java.util.Scanner;

public class c {
public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    int n = Input.nextInt();
    int []arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] =Input.nextInt();
        if(arr[i] > 0){
            System.out.print(1+" ");
        }
        else if (arr[i] < 0){
            System.out.print(2+" "); 
        }
        else {
            System.out.print(0+" ");
        }
    }

    Input.close();
}    
}
