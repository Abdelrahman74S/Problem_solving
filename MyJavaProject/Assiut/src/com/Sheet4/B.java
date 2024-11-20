import java.util.*;

public class B {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String S = input.nextLine();

    for (int i = 0; i < S.length(); i++) {
        if(S.charAt(i) == '\\'){
            break;
        }
        System.out.print(S.charAt(i));
    }
    System.out.println();
    
    
    input.close();
    }


}
