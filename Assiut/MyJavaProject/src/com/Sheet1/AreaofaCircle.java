import java.util.Scanner;

public class AreaofaCircle {
    public static void main(String[] args) {
        try (Scanner Input= new Scanner(System.in)) {
            double pi = 3.141592653;
            float r = Input.nextFloat();
            System.out.printf("%.9f",pi *r * r);
        }
    }
}
