import java.util.Scanner;

public class Difference {
    
    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)){
         long a = Input.nextLong();
         long b = Input.nextLong();
         long c = Input.nextLong();
         long d = Input.nextLong();

         long x =(a * b) - (c * d);
         System.out.printf("Difference = %d",x);
          
         
        }
    }
}
