import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)){
            float x =Input.nextFloat();
            float y =Input.nextFloat();

            if(x > 0 && y > 0){
                System.out.println("Q1");
            }
            else if(x < 0 && y > 0){
                System.out.println("Q2");
            }
            if(x < 0 && y < 0){
                System.out.println("Q3");
            }
            if(x > 0 && y < 0){
                System.out.println("Q4");
            }
            if(x == 0 && (y < 0 || y > 0)){
                System.out.println("Eixo Y");
            }
            if(y == 0 && (x < 0 || x > 0)){
                System.out.println("Eixo X");
            }
            if(x == 0 && y == 0){
                System.out.println("Origem");
            }
        }
    }
}
