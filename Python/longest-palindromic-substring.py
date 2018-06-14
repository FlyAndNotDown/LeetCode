class Solution:
    def __checkIfNextPalindrome(self, s, p, q, count):
        if p - 1 < 0 or q + 1 > len(s) - 1:
            return [p, q, count]
        else:
            if s[p - 1] == s[q + 1]:
                return self.__checkIfNextPalindrome(s, p - 1, q + 1, count + 2)
            else:
                return [p, q, count]

    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        ans = ''
        max = 0
        p = 0
        while p < len(s):
            q = p
            while q < len(s) and s[p] == s[q]:
                q += 1
            q -= 1
            tmp = self.__checkIfNextPalindrome(s, p, q, q + 1 - p)
            if tmp[2] > max:
                max = tmp[2]
                ans = s[tmp[0]:tmp[1] + 1]
            p += 1
        return ans

