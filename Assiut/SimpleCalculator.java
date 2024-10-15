import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
          long x = Input.nextLong();
          long y = Input.nextLong();
          
          System.out.printf("%d + %d = %d\n",x,y,x+y);
          System.out.printf("%d * %d = %d\n",x,y,x*y);
          System.out.printf("%d - %d = %d\n",x,y,x-y);

        }
    }
}
