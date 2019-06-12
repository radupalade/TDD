import org.junit.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class AssertionsTest {

    @Before
    public void messageBefore() {
        System.out.println("message is displayed BEFORE EVERY test");
    }

    @After
    public void messageAfter() {
        System.out.println("message is displayed AFTER EVERY test");
    }

    @BeforeClass
    public static void messageBeforeAllTests() {
        System.out.println("message is displayed BEFORE ALL tests");
    }

    @AfterClass
    public static void messageBeforeAfterTests() {
        System.out.println("message is displayed AFTER ALL tests");
    }

    @Test
    public void testAddOperation() {
        System.out.println("testing <add> operation");
        int a = 20, b = 8;

        assertEquals(28, a + b);
    }

    @Test
    public void testMatcherIs() {
        System.out.println("testing <is> matcher");
        int a = 1, b = 1;
        assertThat(a, is(b));
    }

    @Test
    public void testMatcherAnyOf() {
        System.out.println("testing <anyOf> matcher");
        int a = 1, b = 1, c = 4;
        assertThat(a, anyOf(is(b), is(c)));
    }

    @Test
    public void testMatcherAllOf() {
        System.out.println("testing <allOf> matcher");
        int a = 1, b = 1, c = 1;
        assertThat(a, allOf(is(b), is(c)));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testExpectedIndexOutOfBoundsException() {
        System.out.println("testing expected exception IndexOutOfBoundsException ");

        ArrayList arrayList = new ArrayList();
        arrayList.get(4);
    }

    @Test(expected = ArithmeticException.class)
    public void testExpectedArithmeticException() {
        System.out.println("testing expected exception ArithmeticException");
        int a = 3;
        int b = a / 0;
    }

    @Test(expected = FileNotFoundException.class)
    public void testFileNotFoundException() throws FileNotFoundException {
        System.out.println("testing expected exception FileNotFoundException");
        File file = new File("tdd.txt");
        FileReader fileReader = new FileReader(file);
    }

}
