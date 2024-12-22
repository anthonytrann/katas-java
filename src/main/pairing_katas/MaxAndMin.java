public class MaxAndMin {
    public static int ncMax(int[] numbers) {
        int biggestNumber = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggestNumber){ 
                biggestNumber = numbers[i];
            }
        }
        return biggestNumber;
    }

    public static int ncMin(int[] numbers) {
        int smallestNumber = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallestNumber){ 
                smallestNumber = numbers[i];
            }
        }
        return smallestNumber;
    }
}
