class Solution:
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if len(prices) == 0: return 0
        ans = 0
        max = prices[-1]
        for price in prices[0:-1][::-1]:
            if max - price > ans: ans = max - price
            if price > max: max = price
        return ans
