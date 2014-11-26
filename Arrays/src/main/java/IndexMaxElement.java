import java.util.Arrays;

/**
 *
 */
public class IndexMaxElement {

    public static int max(Integer array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max element = "+ max +". Index of max element  = " + Arrays.asList(array).indexOf(max));
        return Arrays.asList(array).indexOf(max);
    }}
