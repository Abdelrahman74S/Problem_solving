import java.util.Scanner;

public class P {
   public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
     int n =Input.nextInt();

      for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {

            System.out.printf("*");
       }
      System.out.println("");
    Input.close();  
   }
} 
}