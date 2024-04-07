package com.giant.javabasics;

/*
    6️⃣
      🅰️ Implement a program displaying all the numbers from the range 5 – 100 using a ‘for’ loop.
      🅱️ Implement the same program, but using a ‘while’ loop.
*/

public class Exercise6 {
    public static void main(String[] args) {

        for(int i = 5; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 5;
        while(i <= 100) {
            System.out.print(i + " ");
            i++;
        }
    }
}
