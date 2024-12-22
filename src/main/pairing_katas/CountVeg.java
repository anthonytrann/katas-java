import java.util.ArrayList;
import java.util.HashMap;

public class CountVeg {
    public static int getCountVeg(ArrayList<HashMap<String, Object>> vegList, String type) {
        int counter = 0;
        for(int i = 0; i < vegList.size(); i++){
            HashMap<String, Object> veg = vegList.get(i);
            if (veg.get("type") == type) {
                counter = counter + (int) veg.get("quantity");
            }
        }
        return counter;
    }
}
