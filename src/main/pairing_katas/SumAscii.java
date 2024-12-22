import java.util.ArrayList;

public class SumAscii {
    public static int sumAscii(ArrayList<String> names) {
        if(names.size() == 0) {
            return 0;
        }
        int highestScore = Integer.MIN_VALUE;
        for(int i = 0; i < names.size(); i++) {
            String name = names.get(i).toLowerCase();
            int total = 0;
            for(int j = 0; j < name.length(); j++) {
                System.err.println((int) name.charAt(j));
                total += (int) name.charAt(j);
            }
            System.out.println(total);
            if(total > highestScore) {
                highestScore = total;
            }
        }
        return highestScore;
    }
}
