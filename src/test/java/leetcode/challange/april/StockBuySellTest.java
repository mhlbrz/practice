package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockBuySellTest {

    int[] a1 = new int[]{7,1,5,3,6,4};
    int[] a2 = new int[]{1,2,3,4,5};
    int[] a3 = new int[]{7,6,4,3,1};
    int[] a4 = new int[]{7,4,7,6,5,4,8,11};

    @Test
    public void testMaxProfit(){
        assertEquals(7, StockBuySell.maxProfit(a1));
        assertEquals(4, StockBuySell.maxProfit(a2));
        assertEquals(0, StockBuySell.maxProfit(a3));
        assertEquals(10, StockBuySell.maxProfit(a4));
    }

    @Test
    public void testBestDeal() {
        assertEquals(new StockBuySell.Deal(1,4), StockBuySell.bestDeal(a1));
        assertEquals(new StockBuySell.Deal(0,4), StockBuySell.bestDeal(a2));
        assertEquals(new StockBuySell.Deal(0,0), StockBuySell.bestDeal(a3));
        assertEquals(new StockBuySell.Deal(1,7), StockBuySell.bestDeal(a4));
    }

}