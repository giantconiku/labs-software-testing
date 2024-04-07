package com.giant.javabasics;

/*
    3️⃣ Declare two variables of String type and next please declare the boolean variable,
    which will store the result of checking if two previously declared String values are equal
    (Hint: use equals() method from String class). Display boolean value on the standard
    output (screen).
*/

public class Exercise3 {
    public static void main(String[] args) {

        String str1 = "GIANT";
        String str2 = "GJIGAND";

        Boolean areEqual = str1.equals(str2);
        System.out.println(areEqual);
    }
}
