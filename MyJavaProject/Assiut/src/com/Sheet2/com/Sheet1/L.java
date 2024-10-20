package com.Sheet1;
import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x =scanner.nextInt();
            int y=scanner.nextInt();
            int j,gcd=1;
            int min = Math.min(x, y);
            for ( j = 1; j <= min; j++) {
                if (x % j == 0 && y % j == 0) {
                    gcd = j; 
                }
            }
            System.out.println(gcd);

        }
   }   

}