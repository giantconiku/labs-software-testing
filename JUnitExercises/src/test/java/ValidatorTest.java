import com.giant.unittests.Validator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ValidatorTest {

    @Test
    public void nullEmail() {
        Assertions.assertFalse(Validator.isValidEmail(null));
    }

    @Test
    public void emptyEmail() {
        Assertions.assertFalse(Validator.isValidEmail(""));
    }

    @Test
    public void validEmail() {
        Assertions.assertTrue(Validator.isValidEmail("valid@example.com"));
    }

    @Test
    public void invalidEmailWithNoLocalPart() {
        Assertions.assertFalse(Validator.isValidEmail("@example.com"));
    }

    @Test
    public void invalidEmailWithNoAtSymbol() {
        Assertions.assertFalse(Validator.isValidEmail("invalid.example.com"));
    }

    @Test
    public void invalidEmailWithNoDomain() {
        Assertions.assertFalse(Validator.isValidEmail("invalid@.com"));
    }

    @Test
    public void invalidEmailWithNoTopLevelDomain() {
        Assertions.assertFalse(Validator.isValidEmail("invalid@example"));
    }

    @Test
    public void invalidEmailWithSpaces() {
        Assertions.assertFalse(Validator.isValidEmail("invalid email@example.com"));
    }

    // LOCAL PART

    @Test
    public void invalidLocalPartThatStartsWithSpecialChar() {
        Assertions.assertFalse(Validator.isValidEmail(".invalid@example.com"));
    }

    @Test
    public void invalidLocalPartThatEndsWithSpecialChar() {
        Assertions.assertFalse(Validator.isValidEmail("invalid.@example.com"));
    }

    @Test
    public void invalidLocalPartThatHasSpecialCharsExceptDotMinusAndUnderscore() {
        Assertions.assertFalse(Validator.isValidEmail("inv*alid@example.com"));
    }

    @Test
    public void invalidLocalPartThatStartsWithDigit() {
        Assertions.assertFalse(Validator.isValidEmail("5invalid@example.com"));
    }

    @Test
    public void invalidLocalPartThatHasLessThan5Chars() {
        Assertions.assertFalse(Validator.isValidEmail("inv@example.com"));
    }

    // DOMAIN PART

    @Test
    public void invalidDomainPartThatStartsWithSpecialChars() {
        Assertions.assertFalse(Validator.isValidEmail("invalid@.example.com"));
    }

    @Test
    public void invalidDomainPartThatEndsWithSpecialChars() {
        Assertions.assertFalse(Validator.isValidEmail("invalid@example..com"));
    }

    @Test
    public void invalidDomainPartWithCapitalLetters() {
        Assertions.assertFalse(Validator.isValidEmail("invalid@exaMple.com"));
    }

    @Test
    public void invalidDomainPartThatHasSpecialCharsExceptDot() {
        Assertions.assertFalse(Validator.isValidEmail("invalid@exa!mple.com"));
    }

    @Test
    public void invalidDomainPartThatHasLessThan2Chars() {
        Assertions.assertFalse(Validator.isValidEmail("invalid@e.com"));
    }

    // TOP LEVEL DOMAIN PART

    @Test
    public void invalidTopLevelDomainPartWithCapitalLetters() {
        Assertions.assertFalse(Validator.isValidEmail("invalid@example.coM"));
    }

    @Test
    public void invalidTopLevelDomainPartWithSpecialChars() {
        Assertions.assertFalse(Validator.isValidEmail("invalid@example.c*om"));
    }

    @Test
    public void invalidTopLevelDomainPartThatHasLessThan2Chars() {
        Assertions.assertFalse(Validator.isValidEmail("invalid@e.c"));
    }
}
