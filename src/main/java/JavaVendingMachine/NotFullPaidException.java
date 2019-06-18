package JavaVendingMachine;

public class NotFullPaidException extends RuntimeException {
    private String message;
    private long remaining;

    public NotFullPaidException(String message, long remaining) {
        this.message = message;
        this.remaining = remaining;
    }

    public long getRemaining() {
        return remaining;
    }

    @Override
    public String getMessage() {
        return message + remaining;
    }
}

//Read more: https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html#ixzz5r8YguLtA
