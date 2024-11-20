import java.util.Scanner;

public class E {
@SuppressWarnings("unused")
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String S =input.nextLine();
    int sum =0;
    for (char c : S.toCharArray()) {
         sum +=Character.getNumericValue(c);
    }

    System.out.println(sum);
    

    input.close();
}
    
}