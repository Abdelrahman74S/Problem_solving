package com.Sheet1;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
            int n = Input.nextInt();
         
            for (int i =0;i<n;i++) {
                int x =Input.nextInt();
                long fact = 1;

                for (int j =1;j<=x;j++){
                   fact *=j;
                }
                System.out.println(fact);
            }

        }
    }
}
