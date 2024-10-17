import java.util.Scanner;

public class bro {

    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
        String str1 = Input.next();
         String str2 = Input.next();

         String str3 = Input.next();
         String str4 = Input.next();
         
         if(str2.equals(str4) ){
            System.out.println("ARE Brothers");
         }
         else{
            System.out.println("NOT");        
         }
        }
    }
    
}