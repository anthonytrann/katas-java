import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestSumDigits {
    @Test
    public void takesZeroReturnsZero() {
        SumDigits sumdigits = new SumDigits();
        float testNumber = 0;
        float expectedOutput = 0;
        assertEquals(expectedOutput, sumdigits.getSumDigits(testNumber), 0);
    }   

    @Test
    public void takesNumber() {
        SumDigits sumdigits = new SumDigits();
        float testNumber = 123;
        float expectedOutput = 6;
        assertEquals(expectedOutput, sumdigits.getSumDigits(testNumber), 0);
    }   
}