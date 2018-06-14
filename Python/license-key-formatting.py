class Solution:
    def licenseKeyFormatting(self, S, K):
        """
        :type S: str
        :type K: int
        :rtype: str
        """
        string = S.replace('-', '')
        tmp = ''

        count = 0
        for i in range(len(string) - 1, -1, -1):
            tmp += string[i].upper()
            count += 1
            if count == K and i != 0:
                tmp += '-'
                count = 0

        return tmp[::-1]


if __name__ == '__main__':
    solution = Solution()
    print(solution.licenseKeyFormatting('2-5g-3-J', 2))
