/**
 * @no 121
 * @name Best Time to Buy and Sell Stock
 */
class Solution {
public:
    static int maxProfit(vector<int>& prices) {
        if (prices.size() == 0) { return 0; }
        int sell = prices[prices.size() - 1], result = 0;
        for (int i = prices.size() - 1; i > -1; i--) {
            if (prices[i] > sell) { sell = prices[i]; }
            if (sell - prices[i] > result) { result = sell - prices[i]; }
        }
        return result;
    }
};