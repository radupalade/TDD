import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExecutionOrderJUnit {

    @Test
    public void testFibonacci() {
        System.out.println("third...");
    }

    @Test
    public void testCalculator() {
        System.out.println("second...");
    }

    @Test
    public void testGreeter() {
        System.out.println("fourth...");
    }

    @Test
    public void test3() {
        System.out.println("first...");

    }
}
