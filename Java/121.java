/**
 * @no 121
 * @name Best Time to Buy and Sell Stock
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int minPrices = prices[0];
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrices) {
                minPrices = prices[i];
            }
            result = Math.max(result, prices[i] - minPrices);
        }
        return result;
    }
}