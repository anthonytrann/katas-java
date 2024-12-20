import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAlternateCase {
    @Test
    public void emptySring(){
        String expectedOutput = "";
        String result = AlternateCase.getAlternateCase("");
        assertEquals(expectedOutput, result);
    }
}