import java.util.Scanner;

public class K {
    public static void main(String[] args){
        try (Scanner Input = new Scanner(System.in)) {
            int x = Input.nextInt();
            
            for(int i =1 ;i<=x;i++){
                if (x % i == 0) {
                    System.out.println(i);
                }
            }
        }

        
    }
}
