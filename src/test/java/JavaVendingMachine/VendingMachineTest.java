package JavaVendingMachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    private VendingMachineImpl myVendingMachine;

    @Before
    public void init() {
        myVendingMachine = new VendingMachineImpl();
    }

    @Test
    public void testIfPriceForAnItemIsCorrect() {
        assertEquals(35, Item.PEPSI.getPrice());
        assertEquals(25, Item.COKE.getPrice());
    }

    @Test
    public void testIfCurrentBalanceDisplayTheRightAmountOfMoney() {
        myVendingMachine.insertCoin(Coin.QUARTER);
        myVendingMachine.insertCoin(Coin.QUARTER);
        myVendingMachine.insertCoin(Coin.QUARTER);
        myVendingMachine.insertCoin(Coin.QUARTER);
        assertEquals(100, myVendingMachine.getCurrentBalance());
    }

}


