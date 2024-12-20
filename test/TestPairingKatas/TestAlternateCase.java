import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAlternateCase {
    @Test
    public void emptyString(){
        String expectedOutput = "";
        String result = AlternateCase.getAlternateCase("");
        assertEquals(expectedOutput, result);
    }

    @Test
    public void oneWord(){
        String expectedOutput = "HeLlO";
        String result = AlternateCase.getAlternateCase("hello");
        assertEquals(expectedOutput, result);
    }

    @Test
    public void withSpace(){
        String expectedOutput = "HeLlO wOrLd";
        String result = AlternateCase.getAlternateCase("hello world");
        assertEquals(expectedOutput, result);
    }
}