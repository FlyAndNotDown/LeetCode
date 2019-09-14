"""
@no 89
@name Gray Code
"""
class Solution:
    def grayCode(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        ans = []
        for string in self.recursion(n):
            ans.append(int(string, 2))
        return ans

    def recursion(self, n):
        if n == 0:
            return ['0']
        if n == 1:
            return ['0', '1']
        last = self.recursion(n - 1)
        ans = []
        for l in last:
            ans.append('0' + l)
        for l in last[::-1]:
            ans.append('1' + l)
        return ans
