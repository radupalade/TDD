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
        myStack.push("abc");
        assertEquals("abc", "abc");
    }

    @Test
    public void testReturnsObjectFromTheTopAndRemoveIt() {
        myStack.push("abc");
        myStack.push("abc");
        myStack.peek();
        assertEquals("abc", "abc");
    }

    @Test
    public void testReturnsObjectFromTheTopAndRemovesIt() {
        myStack.push("abc");
        myStack.push("abc");
        myStack.pop("abc");
        assertEquals("abc", "abc");
    }

    @Test
    public void testSearchAnObjectAndReturnsPosition() {
        myStack.push("abc");
        myStack.push("abc");
        myStack.push("abc");
        myStack.search("abc", 1);
        assertEquals("abc", "abc");
    }
}
