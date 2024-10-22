import java.util.Scanner;
     
public class O {
   public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
     int n =Input.nextInt();
 
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
 
            System.out.printf("*");
       }
      System.out.println("");
    Input.close();  
   }
} 
}