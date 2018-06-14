class Solution:
    """
    记笔记
    滑动窗口算法，如果自己记不起来了看看这个代码就懂了
    """
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if not s or len(s) == 0:
            return 0
        dic = {}
        left = 0
        max_length = 0
        for right in range(0, len(s)):
            left = max(left, dic[s[right]] + 1 if s[right] in dic.keys() else 0)
            max_length = max(max_length, right - left + 1)
            dic[s[right]] = right
        return max_length
