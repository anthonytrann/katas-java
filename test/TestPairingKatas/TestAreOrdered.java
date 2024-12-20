import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAreOrdered {
    @Test
    public void emptyArray() {
        int[] myNums = {};
        Boolean expectedOutput = false;
        Boolean result = AreOrdered.areOrdered(myNums);
        assertEquals(expectedOutput, result);
    }

    @Test 
    public void orderedList() {
        int[] myNums = {1,4,5,7};
        Boolean expectedOutput = true;
        Boolean result = AreOrdered.areOrdered(myNums);
        assertEquals(expectedOutput, result);
    }

    @Test 
    public void unorderedList() {
        int[] myNums = {1,4,2,5,7};
        Boolean expectedOutput = true;
        Boolean result = AreOrdered.areOrdered(myNums);
        assertEquals(expectedOutput, result);
    }
}
