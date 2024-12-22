import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class TestSumAscii {
    @Test
    public void emptyList() {
        ArrayList<String> names = new ArrayList<>(0);
        int expectedOutput = 0;
        int result = SumAscii.sumAscii(names);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void singleNameLowercase() {
        ArrayList<String> names = new ArrayList<>(0);
        names.add("john");
        int expectedOutput = 431;
        int result = SumAscii.sumAscii(names);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void singleNameUppercase() {
        ArrayList<String> names = new ArrayList<>(0);
        names.add("JOHN");
        int expectedOutput = 431;
        int result = SumAscii.sumAscii(names);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void multipleNames() {
        ArrayList<String> names = new ArrayList<>(0);
        names.add("John");
        names.add("Jon");
        names.add("Johnny");
        names.add("Jo");
        int expectedOutput = 662;
        int result = SumAscii.sumAscii(names);
        assertEquals(expectedOutput, result);
    }
}