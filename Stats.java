import java.util.Arrays;
public class Stats {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE; //smallest possible int
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = args.length;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
            sum += value;
        }
        int avg = sum / count; 
        System.out.println("The count is " + count);
        System.out.println("The sum is " + sum);
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);
        System.out.println("The average is " + avg);
    }
}
