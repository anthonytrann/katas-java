import java.util.HashMap;

public class ReportTheGrandGoatRace {
    public static HashMap<String, String> report(String goatInfo) {
        HashMap<String, String> result = new HashMap<>();
        String[] goatSplit = goatInfo.split(",");
        result.put("first_place", "");
        result.put("goat_with_longest_name", "Bleaters");
        result.put("average_time", "00:30:00");

        int fastestTime = 0;
        String firstPlace = "";
        String longestName = "";
        int totalTime = 0;
        for(int i = 0; i < goatSplit.length; i++) {
            String goat = goatSplit[i];
            System.err.println(goat);
            String[] information = goat.split(": ");
            String name = information[0].strip();
            int timeTaken = timeToSeconds(information[1]);
            System.err.println(name);
            System.err.println(timeTaken);
            if(i == 0) {
                fastestTime = timeTaken;
                firstPlace = name;
                longestName = name;
                totalTime += timeTaken;
            } else {
                if(timeTaken < fastestTime) {
                    fastestTime = timeTaken;
                    firstPlace = name;
                }
    
                if(name.length() > longestName.length()) {
                    longestName = name;
                }
    
                totalTime += timeTaken;    
            }
        }
        int averageTime = (totalTime/goatSplit.length);
        result.put("first_place", firstPlace);
        result.put("goat_with_longest_name", longestName);
        result.put("average_time", secondsToTime(averageTime));

        return result;
    }

    public static int timeToSeconds(String time) {
        String[] h1 = time.split(":");
         
        int hour = Integer.parseInt(h1[0]);
        int minute = Integer.parseInt(h1[1]);
        int second = Integer.parseInt(h1[2]);
         
        int temp;
        temp = second + (60 * minute) + (3600 * hour);
        return temp;
    }

    public static String secondsToTime(int time) {

        int hours = time / 3600;
        int remainingSeconds = time % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
