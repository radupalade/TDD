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
}
