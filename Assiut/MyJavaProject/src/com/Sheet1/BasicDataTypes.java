import java.util.Scanner;

public class BasicDataTypes {
    public static void main(String[] args) {
       try( Scanner Input = new Scanner(System.in)){
         int a = Input.nextInt();
         long    b = Input.nextLong();
         char c = Input.next().charAt(0);
         float f = Input.nextFloat();
         double d = Input.nextDouble(); //import java.math.BigInteger;

  
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(f);
         System.out.printf("%.1f", d);
       }

    }
}
