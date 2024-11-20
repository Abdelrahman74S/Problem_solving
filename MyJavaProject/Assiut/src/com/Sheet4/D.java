import java.util.Scanner;

public class D {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String S = input.nextLine();
        String T = input.nextLine();
        int a=0,b=0;

        for(char c:S.toCharArray()){
            a++; 
        }
        for (char c:T.toCharArray()) {
            b++;
        }

        String swappedA = T.charAt(0) + S.substring(1);
        String swappedB = S.charAt(0) + T.substring(1);

        System.out.println(a + " " + b);
        System.out.println(S + T);
        System.out.println(swappedA + " " + swappedB);
        input.close();
    }
}
