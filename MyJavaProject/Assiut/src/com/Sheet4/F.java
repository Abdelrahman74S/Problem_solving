import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
   
        for (int i = 0; i < n; i++) {
            String S =input.nextLine();

            if(S.length()> 10){
            System.out.println(S.charAt(0) +
                    String.valueOf(S.length() - 2) + 
                    S.charAt(S.length() - 1));
            }
            else {
                System.out.println(S);
            }
        }
        input.close();
    }
}
