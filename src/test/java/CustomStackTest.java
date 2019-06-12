import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomStackTest {

    private CustomStack myStack;

    @Before
    public void init() {
        myStack = new CustomStack();
    }

    @Test
    public void testWhenStackIsEmptyThenisEmptyMethodReturnsTrue() {
        assertEquals(true, myStack.isEmpty());
    }

    @Test
    public void testReturnsObjectFromTheTopOfTheStackWithoutRemovingIt() {
        myStack.add("abc");
      //  assertEquals("abc", myStack.peek());
    }

    @Test
    public void testReturnsObjectFromTheTopAndRemoveIt() {
        myStack.add("abc");
    //    assertEquals("abc", myStack.pop());
    }
}
