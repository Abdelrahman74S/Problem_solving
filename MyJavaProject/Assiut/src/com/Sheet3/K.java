import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();  
        String string = scanner.nextLine();

        long sum = 0;
        for (int i = 0; i < n; i++) {
            int digit = string.charAt(i) - '0';
            sum += digit;
        }

        System.out.println(sum);
        scanner.close();
    }
}
