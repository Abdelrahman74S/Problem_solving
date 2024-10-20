package com.Sheet1;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
            long x =Input.nextLong();
            int a =0, b=0,c=0,d=0;
            for (int i =0; i<x ;i++) {
                long y =Input.nextLong();

                if(y % 2 == 0){
                  a++;
                }
                if(y % 2 != 0){
                  b++;
                }
                if(y > 0){
                  c++;
                }
                if(y < 0){
                  d++;
                }
            }
            System.out.println("Even: "+a);
            System.out.println("Odd: "+b);
            System.out.println("Positive: "+c);
            System.out.println("Negative: "+d);
        }
    }
}
