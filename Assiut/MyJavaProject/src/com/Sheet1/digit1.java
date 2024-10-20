import java.util.Scanner;

public class digit1 {
    public static void main(String[] args) {
     try (Scanner Input = new Scanner(System.in)){
     int a = Input.nextInt();
     int digit = a % 1000;
     int d = a - digit;
     d /=1000;

     String f = d % 2 ==0 ? "EVEN" : "ODD";

     System.out.println(f);
    }
  }
}

