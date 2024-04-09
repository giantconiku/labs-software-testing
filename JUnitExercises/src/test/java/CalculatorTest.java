import com.giant.unittests.Calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void init() {
        System.out.println("Executing method init();");
        calculator = new Calculator();
    }

    @Test
    public void additionTest() {

        // First Phase
        int td1 = 2;
        int td2 = 6;
        int expectedResult = 8;

        // Second Phase
        int actualResult = calculator.addition(td1, td2);

        // Third Phase
//        Assertions.assertEquals(expectedResult, actualResult);

        // Third Phase (Using AsserJ library)
        org.assertj.core.api.Assertions.assertThat(expectedResult).isEqualTo(actualResult);
    }

    @Test
    public void subtractionTest() {

        // First Phase
        int td1 = 2;
        int td2 = 6;
        int expectedResult = -4;

        // Second Phase
        int actualResult = calculator.subtraction(td1, td2);

        // Third Phase
//        Assertions.assertEquals(expectedResult, actualResult);

        // Third Phase (Using AsserJ library)
        org.assertj.core.api.Assertions.assertThat(expectedResult).isEqualTo(actualResult);
    }

    @Test
    public void multiplicationTest() {

        // First Phase
        int td1 = 2;
        int td2 = 6;
        int expectedResult = 12;

        // Second Phase
        int actualResult = calculator.multiplication(td1, td2);

        // Third Phase
//        Assertions.assertEquals(expectedResult, actualResult);

        // Third Phase (Using AsserJ library)
        org.assertj.core.api.Assertions.assertThat(expectedResult).isEqualTo(actualResult);
    }

    @Test
    public void divisionTest() {

        // First Phase
        int td1 = 6;
        int td2 = 2;
        int expectedResult = 3;

        // Second Phase
        int actualResult = calculator.division(td1, td2);

        // Third Phase
//        Assertions.assertEquals(expectedResult, actualResult);

        // Third Phase (Using AsserJ library)
        org.assertj.core.api.Assertions.assertThat(expectedResult).isEqualTo(actualResult);
    }

    @Test
    public void modTest() {

        // First Phase
        int td1 = 6;
        int td2 = 2;
        int expectedResult = 0;

        // Second Phase
        int actualResult = calculator.mod(td1, td2);

        // Third Phase
//        Assertions.assertEquals(expectedResult, actualResult);

        // Third Phase (Using AsserJ library)
        org.assertj.core.api.Assertions.assertThat(expectedResult).isEqualTo(actualResult);
    }
}
