package algorithm.primary.maxProfit;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int profit = 0;
        int i;
        for (int j = 1; j < prices.length; j++) {
            i = j - 1;
            if (prices[i] < prices[j]) {
                profit += prices[j] - prices[i];
            }
        }

        return profit;
    }
}
