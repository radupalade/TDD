import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomListTest {

    private CustomList myList;

    @Before
    public void init() {
        myList = new CustomList();
    }

    @Test
    public void testWhenListIsEmptyThenisEmptyMethodReturnsTrue() {
        assertEquals(true, myList.isEmpty());
    }

    @Test
    public void testWhenListIsNotEmptyThenIsEmptyMethodReturnsFalse() {
        myList.add("abcd");
        assertEquals(false, myList.isEmpty());
    }

    @Test
    public void testWhenAnElementIsAddedToAnEmptyListThenSizeMethodReturnsOne() {
        myList.add("abcd");
        assertEquals(1, myList.size());
    }

    @Test
    public void testWhenAnElementsIsAddedToListThenGetMethodReturnsThatElement() {
        myList.add("abcd");
        assertEquals("abcd", myList.get(0));
    }

    @Test
    public void testWhenTwoElementsAreAddedToListThenGetMethodReturnsBoth() {
        myList.add("abcd");
        myList.add("efgh");
        String element1 = myList.get(0);
        String element2 = myList.get(1);
        assertEquals("abcd", element1);
        assertEquals("efgh", element2);
    }
}
