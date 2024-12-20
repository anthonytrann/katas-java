import javax.naming.spi.DirStateFactory;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestGetCentury {
    @Test
    public void stCenturies() {
        int testYear = 100;
        String result = GetCentury.getCentury(testYear);
        String expectedOutput = "1st";
        assertEquals(expectedOutput, result);

        testYear = 20;
        result = GetCentury.getCentury(testYear);
        expectedOutput = "1st";
        assertEquals(expectedOutput, result);

        testYear = 0;
        result = GetCentury.getCentury(testYear);
        expectedOutput = "1st";
        assertEquals(expectedOutput, result);

        testYear = 2001;
        result = GetCentury.getCentury(testYear);
        expectedOutput = "21st";
        assertEquals(expectedOutput, result);
    }

    @Test
    public void ndCenturies() {
        int testYear = 101;
        String result = GetCentury.getCentury(testYear);
        String expectedOutput = "2nd";
        assertEquals(expectedOutput, result);

        testYear = 199;
        result = GetCentury.getCentury(testYear);
        expectedOutput = "2nd";
        assertEquals(expectedOutput, result);

        testYear = 200;
        result = GetCentury.getCentury(testYear);
        expectedOutput = "2nd";
        assertEquals(expectedOutput, result);
    }

    @Test
    public void rdCenturies() {
        int testYear = 201;
        String result = GetCentury.getCentury(testYear);
        String expectedOutput = "3rd";
        assertEquals(expectedOutput, result);

        testYear = 300;
        result = GetCentury.getCentury(testYear);
        expectedOutput = "3rd";
        assertEquals(expectedOutput, result);
    }

    @Test
    public void thCenturies() {
        int testYear = 301;
        String result = GetCentury.getCentury(testYear);
        String expectedOutput = "4th";
        assertEquals(expectedOutput, result);

        testYear = 901;
        result = GetCentury.getCentury(testYear);
        expectedOutput = "10th";
        assertEquals(expectedOutput, result);

        testYear = 1201;
        result = GetCentury.getCentury(testYear);
        expectedOutput = "13th";
        assertEquals(expectedOutput, result);
    }
}
