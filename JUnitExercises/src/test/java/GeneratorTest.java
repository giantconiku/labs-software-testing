import com.giant.unittests.Generator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GeneratorTest {

    @Test
    public void testGenerateRandomNumberMethod1() {

        // First Phase
        int[] expectedResults = { -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Second Phase
        int actualResult = Generator.generateRandomNumber();

        // Third Phase (Validation)
        boolean flag = false;

        for(int x: expectedResults) {
            if(x == actualResult) {
                flag = true;
                break;
            }
        }

        Assertions.assertTrue(flag);
    }

    @Test
    public void testGenerateRandomNumberMethod2(){

        // Second Phase
        int actualResult = Generator.generateRandomNumber();

        // Third Phase (Validation)
//        Assertions.assertTrue(actualResult >= -10 && actualResult <= 10);

        // Third Phase (Validation) (Using AssertJ library)
        org.assertj.core.api.Assertions.assertThat(actualResult).isGreaterThanOrEqualTo(-10).isLessThanOrEqualTo(10);
    }
}