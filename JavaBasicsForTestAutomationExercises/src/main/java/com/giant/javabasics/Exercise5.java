package com.giant.javabasics;

/*
    5️⃣ Declare an integer variable and assign any value to it.
    Next check, if the value of this variable is greater, or less, or equal to zero.
    In every case, please display the proper information on the screen
    Please use conditional statement construction.
*/

public class Exercise5 {
    public static void main(String[] args) {

        int number = 21;

        if(number > 0) {
            System.out.println(number + " is greater than 0");
        } else if(number < 0) {
            System.out.println(number + " is less than 0");
        } else {
            System.out.println(number + " is equal to 0");
        }
    }
}
