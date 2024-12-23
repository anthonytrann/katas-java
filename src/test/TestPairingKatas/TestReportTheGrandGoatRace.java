import java.util.HashMap;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestReportTheGrandGoatRace {
    @Test
    public void testOneGoat() {
        // String goatInfo = "Bleaters: 00:30:00, Professor Dandelion: 01:00:00, Katherine Jr.: 00:45:00";
        String goatInfo = "Bleaters: 00:30:00,";
        HashMap<String,String> expectedOutput = new HashMap<>();
        expectedOutput.put("first_place", "Bleaters");
        expectedOutput.put("goat_with_longest_name", "Bleaters");
        expectedOutput.put("average_time", "00:30:00");

        HashMap<String,String> result = ReportTheGrandGoatRace.report(goatInfo);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testTwoGoats() {
        // String goatInfo = "Bleaters: 00:30:00, Professor Dandelion: 01:00:00, Katherine Jr.: 00:45:00";
        String goatInfo = "Bleaters: 00:30:00, Professor Dandelion: 01:00:00,";
        HashMap<String,String> expectedOutput = new HashMap<>();
        expectedOutput.put("first_place", "Bleaters");
        expectedOutput.put("goat_with_longest_name", "Professor Dandelion");
        expectedOutput.put("average_time", "00:45:00");

        HashMap<String,String> result = ReportTheGrandGoatRace.report(goatInfo);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void moreGoats() {
        String goatInfo = "Bleaters: 00:30:00, Professor: 01:00:00, Katherine Jr.: 00:45:00";
        HashMap<String,String> expectedOutput = new HashMap<>();
        expectedOutput.put("first_place", "Bleaters");
        expectedOutput.put("goat_with_longest_name", "Katherine Jr.");
        expectedOutput.put("average_time", "00:45:00");

        HashMap<String,String> result = ReportTheGrandGoatRace.report(goatInfo);

        assertEquals(expectedOutput, result);
    }
}
