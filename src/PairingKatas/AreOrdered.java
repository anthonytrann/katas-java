public class AreOrdered {
    public static Boolean areOrdered(int[] numList){
        if (numList.length == 0) {
            return false;
        }
        int previousVal = numList[0];
        for (int i = 0; i < numList.length; i++){
            if (previousVal > numList[i]) {
                return false;
            }
        }
        return true;
    }
}
