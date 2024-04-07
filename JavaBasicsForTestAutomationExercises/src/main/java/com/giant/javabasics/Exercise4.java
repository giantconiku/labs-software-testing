package com.giant.javabasics;

/*
    4️⃣ Declare an integer variable and assign any value to this variable.
    Then using a conditional statement check if it is an even number.
    If yes, please display proper information on the screen.
*/

public class Exercise4 {
    public static void main(String[] args) {

        int number = 26;

        if(number % 2 == 0) {
            System.out.println(number + " is even");
        }
    }
}
