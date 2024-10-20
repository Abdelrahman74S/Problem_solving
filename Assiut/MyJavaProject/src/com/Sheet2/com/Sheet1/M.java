package com.Sheet1;

import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        int y = input.nextInt();
        
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        
        boolean foundLuckyNumber = false; 
        
        for (int i = min; i <= max; i++) {
            int temp = i; 
            boolean isLucky = true; 
            
            while (temp > 0) {
                int digit = temp % 10; 
                if (digit != 4 && digit != 7) {
                    isLucky = false; 
                    break; 
                }
                temp /= 10; 
            }
            
            if (isLucky) {
                System.out.print(i + " ");
                foundLuckyNumber = true; 
            }
        }

        if (!foundLuckyNumber) {
            System.out.println(-1);
        }

        input.close();
    }
}
