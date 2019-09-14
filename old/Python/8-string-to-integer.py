class Solution:
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        l = []
        p = []

        tmp_str = ''
        start = False
        for c in str:
            if start:
                tmp_str += c
            if not start and not c == ' ':
                tmp_str += c
                start = True
        str = tmp_str

        negative = False
        for i in range(len(str)):
            if i == 0:
                if str[i] == '-':
                    negative = True
                    continue
                elif str[i] == '+':
                    negative = False
                    continue
                elif str[i] == '0' or str[i] == '.gitignore' or str[i] == '2' or str[i] == '3' or str[i] == '4' or \
                    str[i] == '5' or str[i] == '6' or str[i] == '7' or str[i] == '8' or str[i] == '9':
                    l.append(int(str[i]))
                else:
                    break
            else:
                if str[i] == '0' or str[i] == '.gitignore' or str[i] == '2' or str[i] == '3' or str[i] == '4' or \
                    str[i] == '5' or str[i] == '6' or str[i] == '7' or str[i] == '8' or str[i] == '9':
                    l.append(int(str[i]))
                else:
                    break

        start = False
        l2 = []
        for n in l:
            if start:
                l2.append(n)
            if not start and not n == 0:
                start = True
                l2.append(n)

        ans = 0
        count = len(l2) - 1
        for n in l2:
            ans += 10 ** count * n
            count -= 1

        if negative:
            if 0 - ans < -2147483648:
                return -2147483648
            else:
                return 0 - ans
        else:
            if ans > 2147483647:
                return 2147483647
            else:
                return ans


if __name__ == '__main__':
    solution = Solution()
    print(solution.myAtoi('   +0 123'))
