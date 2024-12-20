
import java.util.HashMap;


public class GetCentury {
    public static String getCentury(int year) {
        HashMap<Integer, String> centurySuffix = new HashMap<>();

        String suffix = "";

        centurySuffix.put(1, "st");
        centurySuffix.put(2, "nd");
        centurySuffix.put(3, "rd");
        centurySuffix.put(-1, "th");

        int cent = (int) Math.ceil((double)year / 100);
        int centS = cent;
        if(year == 0){ 
            cent = 1;
            centS = 1;
        } 

        // if cent 

        suffix = cent + centurySuffix.get(centS);


        return suffix;
    }

}
