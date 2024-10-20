package com.Sheet1;

import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char symbol = scanner.next().charAt(0);
        
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt(); 

            for (int j = 0; j < num; j++) {
                System.out.print(symbol);
            }
            System.out.println(); 
        }

        scanner.close(); 
    }
}
