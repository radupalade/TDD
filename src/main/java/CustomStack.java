import java.awt.*;
import java.util.Stack;

public class CustomStack {

    private Stack<String> stack;


    public CustomStack() {
        stack = new Stack<String>();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        } else return false;
    }

    public void add(String val) {
        stack.add(val);
    }

  /*  public void push() {
        String value;
        int size = 0;
        Stack<String> stack = new Stack<String>();
        stack[size] = value;
        size++;

    }
*/
  /*  public int peek(int size) {

        return stack[size - 1];
    }*/

    /*public int pop(int size) {
        int value = stack[size - 1];
        stack[size - 1] = 0;
        size--;
        return value;

    }*/

    public String get(int index, int size) {
        if (stack.size() == 0 || index > size - 1) {
            return null;
        }
        return stack.get(index);
    }

}


