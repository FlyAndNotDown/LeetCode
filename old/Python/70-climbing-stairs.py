class Solution:
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        l = [1]
        for i in range(1, n + 1):
            if i == 1: l.append(1)
            else: l.append(l[-1] + l[-2])
        return l[-1]
