"""
@no 231
@name Power of Two
"""
class Solution:
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        return False if n < 0 else True if n == 1 else False if n == 0 else self.isPowerOfTwo(n // 2) if n % 2 == 0 else False
