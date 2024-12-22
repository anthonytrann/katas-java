import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestSumDigits {
    @Test
    public void takesZeroReturnsZero() {
        float result = SumDigits.getSumDigits(0);
        float expectedOutput = 0;
        assertEquals(expectedOutput, result, 0);
    }   

    @Test
    public void takesNumber() {
        float result = SumDigits.getSumDigits(123);
        float expectedOutput = 6;
        assertEquals(expectedOutput, result, 0);
    }   
}