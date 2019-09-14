"""
@no 78
@name Subsets
"""
class Solution:
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        ans = [[]]
        for num in nums:
            new_ans = []
            for a in ans:
                new_ans.append(a)
                t = list(a)
                t.append(num)
                new_ans.append(t)
            ans = new_ans
        return ans
