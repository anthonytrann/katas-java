public class SumDigits {
    public float getSumDigits(float number) {
        String numberStr = "" + number;
        float total = 0;
        for(int i=0; i<numberStr.length(); i++){
            char ch = numberStr.charAt(i);
            if(ch != '.'){
                float charNum = Float.parseFloat("" + ch);
                total = total + charNum;
                System.out.println(total);
            }
        }
        return total;
    }
}