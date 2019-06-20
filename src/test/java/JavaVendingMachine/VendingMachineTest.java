package JavaVendingMachine;

import org.assertj.core.condition.Not;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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

    @Test
    public void testIfTotalSalesDisplayTheRightAmount() {
        myVendingMachine.insertCoin(Coin.QUARTER);
        myVendingMachine.insertCoin(Coin.QUARTER);

        try {
            myVendingMachine.selectItemAndGetPrice(Item.COKE);
        } catch (SoldOutException e) {
            e.printStackTrace();
        }
        try {
            myVendingMachine.collectItemAndChange();
        } catch (NotSufficientChangeException e) {
            e.printStackTrace();
        } catch (NotFullPaidException e) {
            e.printStackTrace();
        }
        assertEquals(25, myVendingMachine.getTotalSales());
    }

    /*@Test
    public int testIfTheChangeIsReturnedCorrectly(List list) {
        int sum = 0;
        int val = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == Coin.PENNY) {
                val = Coin.PENNY.getDenomination();
            }
            if (list.get(i) == Coin.NICKLE) {
                val = Coin.NICKLE.getDenomination();
            }
            if (list.get(i) == Coin.DIME) {
                val = Coin.DIME.getDenomination();
            }
            if (list.get(i) == Coin.QUARTER) {
                val = Coin.QUARTER.getDenomination();
            }
            sum = sum + val;
        }
        return sum;
        }
    */
    @Test
    public void testIfTheChangeIsReturnedCorrectlyAfterCoinsAreAddedAndItemIsBought() {
        myVendingMachine.insertCoin(Coin.NICKLE);
        myVendingMachine.insertCoin(Coin.QUARTER);

        try {
            myVendingMachine.selectItemAndGetPrice(Item.COKE);
        } catch (SoldOutException e) {
            e.printStackTrace();
        }
    }
/*
    @Test(expected = NotSufficientChangeException.class)
    public void testIfNotEnoughChangeWhenProductSelected() throws NotSufficientChangeException, NotFullPaidException, SoldOutException {
        myVendingMachine.insertCoin(Coin.QUARTER);
        myVendingMachine.insertCoin(Coin.QUARTER);
        myVendingMachine.selectItemAndGetPrice(Item.COKE);
        myVendingMachine.collectItemAndChange();
    }*/

    /*@Test(expected = SoldOutException.class)
    public void testIfTheSelectedItemExistsInVendorMachine() throws SoldOutException {
        assertEquals(25, myVendingMachine.selectItemAndGetPrice(Item.COKE));
    }*/

    @Test(expected = NotFullPaidException.class)
    public void testIfProductIsSelectedAndThereAreEnoughCoins() throws SoldOutException, NotSufficientChangeException, NotFullPaidException {
        myVendingMachine.selectItemAndGetPrice(Item.COKE);
        myVendingMachine.collectItemAndChange();
    }

}


