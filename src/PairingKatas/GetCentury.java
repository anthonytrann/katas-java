
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
        int centS = -1;
        String centStr = "" + cent;
        int LastIndexOfCentStr = centStr.length() -1;
        
        if(year == 0){ 
            cent = 1;
            centS = 1;
        } else if (centStr.charAt(LastIndexOfCentStr) == '1' && cent != 11) {
            centS = 1;
        } else if (centStr.charAt(LastIndexOfCentStr) == '2' && cent != 12) {
            centS = 2;
        }
        else if (centStr.charAt(LastIndexOfCentStr) == '3' && cent != 13) {
            centS = 3;
        } 

        suffix = cent + centurySuffix.get(centS);

        return suffix;
    }

}
