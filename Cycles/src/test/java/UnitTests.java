import javafx.scene.chart.XYChart;
import org.junit.Test;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;
/**
 *
 */
public class UnitTests {

    //Unit test for task 1
    @Test
    public void TestAmountEvenNumber() {
        int[] expected ={2450, 49};
        int[] actual = AmountEvenNumbers.main(null);
        assertArrayEquals(expected, actual);
    }

    //Unit tests for task 2
    @Test
    public void TestPrimeNumber() {
        int[] array = {1, 100, 120, 4};
        boolean[] expected = {true, false, false, false};
        int idx = 0;
        for(int i : array){
          boolean actual = PrimeNumber.main(i);
          assertEquals(actual, expected[idx]);
          idx++;
          }
    }


    //Unit tests for task 3
    @Test
    public void TestRating() {
        int[] testRate = new int[]{0, 10, 19, 20, 27, 39, 40, 50, 59, 60, 70, 74, 75, 80, 89, 90, 95, 100};
        String[] testMark = new String[]{"F", "F", "F", "E", "E", "E", "D", "D", "D", "C", "C", "C", "B", "B", "B", "A", "A", "A"};

        int idx = 0;
        for (int x : testRate) {
                String expected = testMark[idx];
                //String actual = StudentRating.main(x);
                //assertEquals(expected, actual);
                idx++;
        }
    }

    //Unit tests for task 4
    @Test
    public void TestFactorial() {
        int[] array = {1, 2, 3, 4};
        int[] expected = {1, 2, 6, 24};
        int idx = 0;
        for(int i : array){
            int actual = Factorial.main(i);
            assertEquals(actual, expected[idx]);
            idx++;
        }
    }

    //Unit tests for task 5
    @Test
    public void TestAmountDigits() {
        int[] array = {123, 2, 17, 100, -100, 0};
        int[] expected = {6, 2, 8, 1, -1, 0};
        int idx = 0;
        for(int i : array){
            int actual = AmountDigits.main(i);
            assertEquals(expected[idx], actual);
            idx++;
        }
    }

    //Unit tests for task 6
    @Test
    public void ReverseNumber() {
        int[] array = {123, 7, 200, 147, 5556};
        int[] expected = {321, 7, 002, 741, 6555};
        int idx = 0;
        for(int i : array){
            int actual = Integer.parseInt(ReverseNumber.main(i));
            assertEquals(expected[idx], actual);
            idx++;
        }
    }
}
