import org.junit.Test;
import static org.junit.Assert.*;

public class TestSumArgs {
    @Test
    public void noArgs() {
        int expectedOutput = 0;
        int result = SumArgs.sumArgs();
        assertEquals(expectedOutput, result);
    }

    @Test
    public void oneArg() {
        int expectedOutput = 4;
        int result = SumArgs.sumArgs(4);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void moreArgs() {
        int expectedOutput = 9;
        int result = SumArgs.sumArgs(4, 5);
        assertEquals(expectedOutput, result);
    }
}
