import java.util.*;
public class A {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String S = input.next();
        String T = input.next();
        int a=0,b=0;

        for(char c:S.toCharArray()){
            a++;
           
        }
        for (char c:T.toCharArray()) {
            b++;
        }

        System.out.println(a + " " + b);
        System.out.println(S + " " + T);

        input.close();
    }
}
