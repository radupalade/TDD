import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    private Fibonacci myFibonacci;

    @Before
    public void init() {
        myFibonacci = new Fibonacci(0, 1, 0);
    }

    @Test
    public void testFibonacciNumber() {

        myFibonacci.computeNonRecursive(8);
        assertEquals(8, 8);

    }

    @Test
    public void testFibonacciNumberTwo() {
        myFibonacci.computeRecursive(4);
        assertEquals(4, 4);
    }

    @Test
    public void testFibonacciNumberThree() {
        myFibonacci.computeNonRecursive(10);
        assertEquals(10, 10);
    }

    @Test
    public void testFibonacciNumberWithIndexTwoThreeFiveAndEight() {
        assertEquals(1, myFibonacci.computeRecursive(2));
        assertEquals(2, myFibonacci.computeRecursive(3));
        assertEquals(5, myFibonacci.computeRecursive(5));
        assertEquals(21, myFibonacci.computeRecursive(8));
    }
}
