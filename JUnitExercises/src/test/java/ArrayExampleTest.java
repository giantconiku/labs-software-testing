import com.giant.unittests.ArrayExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayExampleTest {

    @Test
    public void removeDuplicatesTestForNoDuplicatedArray() {

        // First Phase
        String[] strings = {"car", "bus", "train"};
        String[] expectedResult = strings;

        // Second Phase
        String[] actualResult = ArrayExample.removeDuplicates(strings);

        // Third Phase (Validation)
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void removeDuplicatesTestForOneTimeDuplicatedElementsArray() {

        // First Phase
        String[] strings = {"car", "bus", "bus"};
        String[] expectedResult = {"car", "bus"};

        // Second Phase
        String[] actualResult = ArrayExample.removeDuplicates(strings);

        // Third Phase (Validation)
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void removeDuplicatesTestForTwoOrManyTimesDuplicatedElementsArray() {

        // First Phase
        String[] strings = {"car", "bus", "bus", "car", "train", "bus", "car", "bus"};
        String[] expectedResult = {"car", "bus", "train"};

        // Second Phase
        String[] actualResult = ArrayExample.removeDuplicates(strings);

        // Third Phase (Validation)
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void removeDuplicatesTestForAllDuplicatedElementsArray() {

        // First Phase
        String[] strings = {"bus", "bus", "bus"};
        String[] expectedResult = {"bus"};

        // Second Phase
        String[] actualResult = ArrayExample.removeDuplicates(strings);

        // Third Phase (Validation)
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void removeDuplicatesTestEmptyArray() {

        // First Phase
        String[] strings = {};
        String[] expectedResult = {};

        // Second Phase
        String[] actualResult = ArrayExample.removeDuplicates(strings);

        // Third Phase (Validation)
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void removeDuplicatesTestNullArray() {

        // First Phase
        String[] strings = null;
        String[] expectedResult = null;

        // Second Phase
        String[] actualResult = ArrayExample.removeDuplicates(strings);

        // Third Phase (Validation)
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}


//////////////////////////////////////////////////////////////////////////////////
//
//        Long Version (Without assertArrayEquals() method)
//
//        boolean sameLength = expectedResult.length == actualResult.length;
//
//        boolean sameElementsInTheSameOrder = true;
//
//        for (int s = 0; s < expectedResult.length; s++) {
//            if(!expectedResult[s].equals(actualResult[s])){
//                sameElementsInTheSameOrder = false;
//                break;
//            }
//            s++;
//        }
//
//        Assertions.assertTrue(sameLength && sameElementsInTheSameOrder);
