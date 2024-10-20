package com.Sheet1;

import java.util.Scanner;

public class B{
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
            long n = Input.nextLong();
            boolean b = false;
            for(int i =1;i<=n;i++){
                if(i % 2 ==0){
                    b =true;
                System.out.println(i);
                }
            }
            if (!b) {
                System.out.println(-1);
            }
        }
    }
}
