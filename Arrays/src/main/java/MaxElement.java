import java.util.Arrays;
/**
 *
 */
public class MaxElement {

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max element  = "+max);
        return max;
    }

    }
