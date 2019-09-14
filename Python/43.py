"""
@no 43
@name Multiply Strings
"""
class Solution:
    def add(self, num1, num2):
        ans = ''
        count = 0
        temp = 0
        up = 0
        while len(num1) - 1 - count >= 0 or len(num2) - 1 - count >= 0:
            a = int(num1[len(num1) - 1 - count]) if len(num1) - 1 - count >= 0 else 0
            b = int(num2[len(num2) - 1 - count]) if len(num2) - 1 - count >= 0 else 0
            temp = a + b + up
            up = temp // 10
            temp = temp % 10
            ans = str(temp) + ans
            count += 1
        if up > 0: ans = str(up) + ans
        return ans

    def simpleMul(self, num1, num2):
        ans = ''
        count = 0
        temp = 0
        up = 0
        while len(num1) - 1 - count >= 0:
            temp = int(num1[len(num1) - 1 - count]) * int(num2) + up
            up = temp // 10
            temp = temp % 10
            ans = str(temp) + ans
            count += 1
        if up > 0: ans = str(up) + ans
        return ans

    def multiply(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        ans = ''
        count = len(num1)
        for num in num1:
            temp = self.simpleMul(num2, num)
            ans = self.add(ans, temp + '0' * (count - 1))
            count -= 1
        while len(ans) > 1 and ans[0] == '0':
            ans = ans[1:]
        return ans
