package com.giant.unittests;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*
     5️⃣ Using the TDD approach, write a method that validates the email address pass in the parameter.
*/

public class Validator {

    private static final String EMAIL_REGEX = "^[a-zA-Z][a-zA-Z0-9._-]{3,}[a-zA-Z0-9]@[a-z][a-z.]*[a-z]\\.[a-z]{2,}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
