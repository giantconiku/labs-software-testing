package com.giant.javabasics;

/*
    2️⃣ Declare three variables of String type and assign it values. Then declare a fourth
    variable of type String which will be a concatenation of previously declared variables and
    display its value on the screen. Please do it in two ways:
       🅰️ Using ‘+’ operator
       🅱️ Using concat() method from String class
*/

public class Exercise2 {
    public static void main(String[] args) {

        String str1 = "I'm ";
        String str2 = "the ";
        String str3 = "GIANT";

        String concat1 = str1 + str2 + str3;
        String concat2 = str1.concat(str2).concat(str3);

        System.out.println("Using ‘+’ operator: " + concat1 +
                "\nUsing concat() method from String class: " + concat2);
    }
}
