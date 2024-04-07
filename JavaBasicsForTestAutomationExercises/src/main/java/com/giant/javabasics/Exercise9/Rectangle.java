package com.giant.javabasics.Exercise9;

/*
    9️⃣ Implement a class named Rectangle, which has two integer fields: a, b (the side lengths of the rectangle).
    Please, add a constructor, which will set values of all fields.
    Add to class definition also the method named getArea(), which returns the area of the rectangle
    and getPerimeter() returning figure perimeter.
    For the created class definition add a test class with main() method, where you have
    to create an instance of type Rectangle using two-arguments constructor, then call getArea()
    and getPerimeter() methods and display returned values on the standard output.
*/

public class Rectangle {

    private int a;
    private int b;

    public Rectangle() {}

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getArea() {
        return a * b;
    }

    public int getPerimeter() {
        return 2 * a + 2 * b;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 6);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
