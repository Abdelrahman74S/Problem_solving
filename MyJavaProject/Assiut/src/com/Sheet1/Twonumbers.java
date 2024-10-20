import java.util.Scanner;

public class Twonumbers {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        int floor = Math.floorDiv((int) number1, (int) number2);
        int ceil = (int) Math.ceil(number1 / number2);
        int round = (int) Math.round(number1 / number2);
        System.out.println("floor " + (int) number1 + " / " + (int) number2 + " = " + floor);
        System.out.println("ceil "  + (int) number1 + " / " + (int) number2 + " = " + ceil);
        System.out.println("round " + (int) number1 + " / " + (int) number2 + " = " + round);
        }
    }
}
