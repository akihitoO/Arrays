import java.util.Arrays;

/**
 *
 */
public class MinElement {

    public static int main(int[] numbers) {

        Arrays.sort(numbers);
        System.out.println("Min element  = "+numbers[0]);
        return numbers[0];
    }

    }
