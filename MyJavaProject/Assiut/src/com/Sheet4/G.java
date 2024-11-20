import java.util.Scanner;

public class G {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String  S = input.nextLine();
    char[] resultarray = S.toCharArray();

    for (int i = resultarray.length - 1; i >= 0; i--) {
        String S1 = String.valueOf(resultarray[i]);
        System.out.print(S1.toUpperCase());   
     }
    input.close();
}

}
