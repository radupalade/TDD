public class CustomStack {

    //    private Stack<String> stack;
    private int size = 0;
    private String[] stack;

    public CustomStack() {
        stack = new String[10];
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else return false;
    }

   /* public void add(String val) {
        stack.add(val);
    }*/

    public String push(String val) {

        stack[size] = val;
        size++; //works until size[9]

        return val;

    }

    public String peek() {

        return stack[size - 1];
    }

    public void pop(String val) {
        val = stack[size - 1];
        stack[size - 1] = String.valueOf(0);
        size--;

    }

    public int search(String element, int index) {
        if (stack[index] == element || index > size - 1) {
            return index;
        } else {
            return -1;
        }

    }
}


