package com.Sheet1;

import java.util.Scanner;
 
public class H {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();
 
            if (x < 2) {
                System.out.println("NO");
                return;
            }
 
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}