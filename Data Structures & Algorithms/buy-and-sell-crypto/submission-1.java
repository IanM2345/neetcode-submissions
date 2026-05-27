class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int result = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                profit = prices[j] - prices[i];
                if (profit > 0) {
                    result = Math.max(profit, result);
                }
            }
        }

        return result;
    }
}
