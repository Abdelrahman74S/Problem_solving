import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)) {
            int daysNumber = Input.nextInt();

            int year = daysNumber / 365;
            daysNumber = daysNumber % 365;

            System.out.println(year + " years");

            int month = daysNumber / 30;
            daysNumber = daysNumber % 30;

            System.out.println(month + " months");

            int day = daysNumber;

            System.out.println(day + " days");
        }
    }
}
