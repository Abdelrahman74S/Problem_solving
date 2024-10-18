import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
            long n = Input.nextLong();

            for(int i =1;i<=n;i++){
                System.out.println(n);
            }
        }
    }
}
