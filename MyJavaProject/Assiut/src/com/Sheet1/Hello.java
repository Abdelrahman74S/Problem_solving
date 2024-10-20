import java.util.Scanner;

public class Hello{
 public static void main(String[] args) {
   try (Scanner Input = new Scanner(System.in)) {
      String str = Input.nextLine();
      System.out.println("Hello, "+ str);
   }
 }

}