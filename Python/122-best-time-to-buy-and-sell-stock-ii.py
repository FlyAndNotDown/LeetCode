class Solution:
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        max = 0
        for i in range(1, len(prices)):
            max += prices[i] - prices[i - 1] if prices[i] - prices[i - 1] > 0 else 0
        return max
