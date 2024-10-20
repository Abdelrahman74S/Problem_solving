import java.util.Scanner;

public class NChar {
    public static void main(String[] args) {
    try(Scanner Input = new Scanner(System.in)){
        String str1 = Input.nextLine();
        
        if (str1.length() == 1) {
            char ch = str1.charAt(0);
       
        if (ch >= 'A' && ch <= 'Z') {
            System.out.printf("%c",ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            System.out.printf("%c",ch - 32);
        }
   
        }
    }

    }
}
