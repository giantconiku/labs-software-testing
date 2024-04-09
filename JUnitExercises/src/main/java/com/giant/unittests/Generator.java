package com.giant.unittests;

import java.util.Random;

/*
    2️⃣ Create Generator class and implement a static method that generates a random number between -10 and 10.
    Then create unit tests with JUnit inside GeneratorTest class to test this method.
*/

public class Generator {

    public static int generateRandomNumber() {

        Random random = new Random();
        return random.nextInt(21) - 10;
//        return 10 - (int)(Math.random() * 21);
    }
}
