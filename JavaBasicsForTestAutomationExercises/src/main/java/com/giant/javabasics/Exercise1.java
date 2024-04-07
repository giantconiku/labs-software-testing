package com.giant.javabasics;

/*
    1️⃣
      🅰️ Declare and initialize three variables of type int: a, b, c (initialize it to any values)
         Store the result of the (a - b - c) operation in the variable result1 and then display it on the standard output (screen)
      🅱️ Declare and initialize three variables of type long: d, e, f (initialize it to any values)
         Store the result of the (d * e / f) operation in the variable result2 and then display it on the standard output (screen)
*/

public class Exercise1 {
    public static void main(String[] args) {

        int a = 2;
        int b = 6;
        int c = 4;

        int result1 = a - b - c;
        System.out.println(result1);

        long d = 4;
        long e = 7;
        long f = 9;

        long result2 = d * e / f;
        System.out.println(result2);
    }
}