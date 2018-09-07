class Solution:
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        ans = []
        self.test('', 0, 0, ans, n)
        return ans

    def test(self, string, left_num, right_num, ans, n):
        if len(string) == 2 * n: ans.append(string)
        if left_num < n: self.test(string + '(', left_num + 1, right_num, ans, n)
        if right_num < left_num: self.test(string + ')', left_num, right_num + 1, ans, n)
