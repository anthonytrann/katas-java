public class SumArgs {
    public static int sumArgs(int... args){
        int sum = 0;
       for (int i = 0; i < args.length; i ++) {
            sum += args[i];
        }
        return sum;
    }
}
