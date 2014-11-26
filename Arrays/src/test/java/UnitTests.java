import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 */
public class UnitTests {

    //Unit test for task 1
    @Test
    public void TestMinElement() {

        int[] numbers = {9,22,32,43,400,-7,0,100500};
        int expected = -7;
        int actual = MinElement.main(numbers);
        assertEquals(expected, actual);
    }

    //Unit tests for task 2
    @Test
    public void TestMaxElement() {
        double[] numbers = {9.0,22,32.7,43.6,400,-7.1,0,0.2,100000.0};
        double expected = 100500.0;
        double actual = MaxElement.max(numbers);
        assertEquals(expected, actual, 0.00000001);
    }

    //Unit tests for task 3
    @Test
    public void TestIndexMinElement() {
        Integer numbers[] = {-4,3,2,-7,288};
        int expected = 3;
        int actual = IndexMinElement.min(numbers);
        assertEquals(expected, actual);
    }

    //Unit tests for task 4
    @Test
    public void TestIndexMaxElement() {
        Integer numbers[] = {-400,500,3,2,-7,288,-8};
        int expected = 1;
        int actual = IndexMaxElement.max(numbers);
        assertEquals(expected, actual);
    }
}
