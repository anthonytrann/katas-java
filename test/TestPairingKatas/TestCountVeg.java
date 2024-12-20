import java.util.ArrayList; 
import java.util.HashMap;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCountVeg {
    @Test
    public void takesListOfDictionaryReturnsNothing(){
        HashMap<String, Object> vegDict1 = new HashMap<>();
        vegDict1.put("name", "Parsnip");
        vegDict1.put("type", "root");
        vegDict1.put("quantity", 4);

        HashMap<String, Object> vegDict2 = new HashMap<>();
        vegDict2.put("name", "Broccoli");
        vegDict2.put("type", "brassica");
        vegDict2.put("quantity", 1);

        HashMap<String, Object> vegDict3 = new HashMap<>();
        vegDict3.put("name", "Carrot");
        vegDict3.put("type", "root");
        vegDict3.put("quantity", 5);

        HashMap<String, Object> vegDict4 = new HashMap<>();
        vegDict4.put("name", "Onion");
        vegDict4.put("type", "bulb");
        vegDict4.put("quantity", 3);

        ArrayList<HashMap<String, Object>> vegList = new ArrayList<>();
        vegList.add(vegDict1);
        vegList.add(vegDict2);
        vegList.add(vegDict3);
        vegList.add(vegDict4);

        int expectedOutput = 0;
        int result = CountVeg.getCountVeg(vegList, "nothing");
        assertEquals(expectedOutput, result, 0);
    }

    @Test
    public void returnsCorrectResultWithCorrectType(){
        HashMap<String, Object> vegDict1 = new HashMap<>();
        vegDict1.put("name", "Parsnip");
        vegDict1.put("type", "root");
        vegDict1.put("quantity", 4);

        HashMap<String, Object> vegDict2 = new HashMap<>();
        vegDict2.put("name", "Broccoli");
        vegDict2.put("type", "brassica");
        vegDict2.put("quantity", 1);

        HashMap<String, Object> vegDict3 = new HashMap<>();
        vegDict3.put("name", "Carrot");
        vegDict3.put("type", "root");
        vegDict3.put("quantity", 5);

        HashMap<String, Object> vegDict4 = new HashMap<>();
        vegDict4.put("name", "Onion");
        vegDict4.put("type", "bulb");
        vegDict4.put("quantity", 3);

        ArrayList<HashMap<String, Object>> vegList = new ArrayList<>();
        vegList.add(vegDict1);
        vegList.add(vegDict2);
        vegList.add(vegDict3);
        vegList.add(vegDict4);

        int expectedOutput = 9;
        int result = CountVeg.getCountVeg(vegList, "root");
        assertEquals(expectedOutput, result, 0);
    }
}
