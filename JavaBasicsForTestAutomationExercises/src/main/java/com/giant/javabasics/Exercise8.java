package com.giant.javabasics;

import java.util.Scanner;

/*
    8️⃣ Implement the program, where you have to read 6 integers (using Scanner class)
    and save them in the previously declared 6-element table.
    Then compute an arithmetic average for all table values
    and display the result on the standard output.
*/

public class Exercise8 {
    public static void main(String[] args) {

        int[] numbers = new int[6];
        int sum = 0;

        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 6; i++) {
            numbers[i] = in.nextInt();
            sum += numbers[i];
        }

        System.out.println((double) sum / 6);
    }
}
