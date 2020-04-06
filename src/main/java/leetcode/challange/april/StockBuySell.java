package leetcode.challange.april;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete as many transactions as
 * you like (i.e., buy one and sell one share of the stock multiple times).
 * <p>
 * Note: You may not engage in multiple transactions at the same time
 * (i.e., you must sell the stock before you buy again).
 * <p>
 * Example 1:
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * <p>
 * Example 2:
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 * engaging multiple transactions at the same time. You must sell before buying again.
 * <p>
 * Example 3:
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class StockBuySell {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }

    // find indices of buy and sell for max price for single deal
    public static Deal bestDeal(int[] prices) {
        Deal deal = new Deal(0, 0);
        int maxProfit = 0;
        int low = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[low]) {
                low = i;
            } else {
                int diff = prices[i] - prices[low];
                if (diff > maxProfit) {
                    maxProfit = diff;
                    deal.buyInd = low;
                    deal.sellInd = i;
                }
            }
        }
        return deal;
    }

    public static class Deal {
        int buyInd;
        int sellInd;

        public Deal(int buyInd, int sellInd) {
            this.buyInd = buyInd;
            this.sellInd = sellInd;
        }

        @Override
        public boolean equals(Object obj) {
            Deal deal = (Deal) obj;
            return this.buyInd == deal.buyInd && this.sellInd == deal.sellInd;
        }

        @Override
        public String toString() {
            return "Deal{" +
                    "buyInd=" + buyInd +
                    ", sellInd=" + sellInd +
                    '}';
        }
    }

}
