import java.util.Arrays;

/**
 *
 */
public class IndexMinElement {

    public static int min(Integer array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min element = "+ min +". Index of min element  = "+Arrays.asList(array).indexOf(min));
        return Arrays.asList(array).indexOf(min);

    }}
