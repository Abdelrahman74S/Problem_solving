import java.util.Scanner;

public class Multiples {
public static void main(String[] args) {
    try (Scanner Input = new Scanner(System.in)){
        int a =Input.nextInt();
        int b =Input.nextInt();
        String s = a % b == 0 || b % a == 0 ? "Multiples" : "No Multiples" ;
        System.out.println(s);
    }   
  }
}
