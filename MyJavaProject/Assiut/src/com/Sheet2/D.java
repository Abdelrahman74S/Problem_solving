
import java.util.Scanner;

public class D {
  public static void main(String[] args) {
    try(Scanner Input = new Scanner(System.in)){

        while(true){
          long x =Input.nextLong();

          if(x == 1999){
            System.out.println("Correct");
            break;
          }
          else{
            System.out.println("Wrong");
          }
         }
        }
    }
}