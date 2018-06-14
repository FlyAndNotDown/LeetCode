class Solution:
    def isPowerOfFour(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num == 0:
            return False
        while num != 1:
            if num % 4 == 0:
                num = num / 4
            else:
                return False
        return True
