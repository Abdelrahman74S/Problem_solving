import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)) {
        double a = Input.nextFloat();
        
        if(a  == (int) a){
            System.out.println("int "+(int)a);
        }
        else{
            int b = (int) a;
            System.out.printf("float %d %.3f",b,(a -b));
        }
        }
    }
}

