import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestMaxAndMin {
    @Test
    public void testMax() {
        int[] numbers = {4, 2, 6, 7, 3, 2, 1, 5};
        int expectedOuput = 7;
        int result = MaxAndMin.ncMax(numbers);
        assertEquals(expectedOuput, result);
    }

    @Test
    public void testMin() {
        int[] numbers = {4, 2, 6, 7, 3, 2, 1, 5};
        int expectedOuput = 1;
        int result = MaxAndMin.ncMin(numbers);
        assertEquals(expectedOuput, result);
    }
}
