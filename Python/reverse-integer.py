class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        negative = x < 0
        if negative:
            x = 0 - x

        if x % 10 == 0:
            x = x // 10

        l = []
        while x:
            l.append(x % 10)
            x = x // 10

        number = 0
        count = 0
        for i in l[::-1]:
            number += (10**count) * i
            count += 1

        if number > 2**31 - 1:
            return 0
        else:
            if negative:
                return 0 - number
            else:
                return number
