
import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
            int n =Input.nextInt();
            for(int i =1;i<=12;i++){
                System.out.printf("%d * %d = %d",n,i,n*i);
                System.out.printf("\n");
            }
            
        }
           
    }    
}
