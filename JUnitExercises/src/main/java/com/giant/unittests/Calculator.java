package com.giant.unittests;

/*
    1️⃣ Create Calculator class and implement operations: addition, subtraction, multiplication, division.
    Then create CalculatorTest class with tests for the above operations.

    3️⃣ Change Calculator class from task 1 to use the AssertJ assertion.
*/

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }
}