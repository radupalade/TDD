package JavaVendingMachine;

public class SoldOutException extends RuntimeException {
    private String message;

    public SoldOutException(String string) {
        this.message = string;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

//  Read more: https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html#ixzz5r8YydMaR
