import javafx.scene.chart.XYChart;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
/**
 *
 */
public class UnitTests {

    //Unit test for task 1
    @Test
    public void TestEvenNumber() {

        int[] a = new int[]{5, 4};
        int[] b = new int[]{2, 1};
        int[] expected = new int[]{7, 4};
        int idx = 0;
        for (int x : a) {
            int actual = EvenNumber.main(x,b[idx]);
            assertEquals(expected[idx], actual);
            idx++;
        }
    }

    //Unit tests for task 2
    @Test
    public void TestXYPoint() {
        int[] x = new int[]{-1, 2, -1, 2, 0, 1, 0};
        int[] y = new int[]{-1, 2, 1, -2, 1, 0, 0};
        String[] expected = new String[]{"-X-Y", "XY", "-XY", "X-Y", "X", "Y", "0:0"};
        int idx = 0;
        for (String i : expected) {
            String actual = XYPoint.main(x[idx],y[idx]);
            assertEquals(i, actual);
            idx++;
        }
    }

    //Unit tests for task 3
    @Test
    public void TestAmountPositiveNumbers() {
        int[] test = new int[]{-1,4,5};
        int expected = 9;
        int actual = AmountPositiveNumbers.main(test);
        assertEquals(expected, actual);
    }

    //Unit tests for task 4
    @Test
    public void TestRating() {
        int[] testRate = new int[]{0, 10, 19, 20, 27, 39, 40, 50, 59, 60, 70, 74, 75, 80, 89, 90, 95, 100};
        String[] testMark = new String[]{"F", "F", "F", "E", "E", "E", "D", "D", "D", "C", "C", "C", "B", "B", "B", "A", "A", "A"};

        int idx = 0;
        for (int x : testRate) {
                String expected = testMark[idx];
                String actual = StudentRating.main(x);
                assertEquals(expected, actual);
                idx++;
        }
    }
}
