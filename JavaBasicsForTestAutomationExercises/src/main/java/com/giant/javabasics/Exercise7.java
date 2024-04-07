package com.giant.javabasics;

/*
    7️⃣ Implement the program displaying all the numbers from the range 1 - 100
    which are divisible by 5 beginning from 100 (in reverse order).
*/

public class Exercise7 {
    public static void main(String[] args) {

        for(int i = 100; i > 0; i--) {
            if(i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
