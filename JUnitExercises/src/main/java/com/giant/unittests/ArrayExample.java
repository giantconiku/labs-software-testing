package com.giant.unittests;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;

/*
    4️⃣ Implement the method in the ArrayExample class using the TDD approach:
    • public static String[] removeDuplicates(String[] array)
    Method should return new array without duplicates.
*/

public class ArrayExample {

    public static String[] removeDuplicates(String[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        Set<String> uniqueElements = new LinkedHashSet<>(Arrays.asList(array));
        return uniqueElements.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] strings = {"car", "bus", "bus", "car", "train", "bus", "car", "bus"};
        System.out.println(Arrays.toString(ArrayExample.removeDuplicates(strings)));
    }
}
