import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCheckUsernames {
    @Test
    public void atLeast5chars() {
        boolean expectedOutput = true;
        boolean result = CheckUsernames.checkUsernames("asdf2");
        assertEquals(expectedOutput, result);

        expectedOutput = false;
        result = CheckUsernames.checkUsernames("adsf");
        assertEquals(expectedOutput, result);
    }

    @Test
    public void atMost20chars() {
        boolean expectedOutput = true;
        boolean result = CheckUsernames.checkUsernames("hellohellohellohello");
        assertEquals(expectedOutput, result);

        expectedOutput = false;
        result = CheckUsernames.checkUsernames("hellohellohellohello1");
        assertEquals(expectedOutput, result);
    }

    @Test
    public void onlyLowercase() {
        boolean expectedOutput = true;
        boolean result = CheckUsernames.checkUsernames("hellohellohellohello");
        assertEquals(expectedOutput, result);

        expectedOutput = false;
        result = CheckUsernames.checkUsernames("helloHellohellohello");
        assertEquals(expectedOutput, result);
    }

    @Test
    public void hasDigits() {
        boolean expectedOutput = true;
        boolean result = CheckUsernames.checkUsernames("hello11111");
        assertEquals(expectedOutput, result);

        expectedOutput = true;
        result = CheckUsernames.checkUsernames("11111");
        assertEquals(expectedOutput, result);
    }

    @Test
    public void hasUnderscore() {
        boolean expectedOutput = true;
        boolean result = CheckUsernames.checkUsernames("hello11111_");
        assertEquals(expectedOutput, result);

        expectedOutput = true;
        result = CheckUsernames.checkUsernames("111_11");
        assertEquals(expectedOutput, result);
    }

    @Test
    public void hasExtraChars() {
        boolean expectedOutput = false;
        boolean result = CheckUsernames.checkUsernames("hello11111.");
        assertEquals(expectedOutput, result);

        expectedOutput = false;
        result = CheckUsernames.checkUsernames("111!");
        assertEquals(expectedOutput, result);
    }
}
