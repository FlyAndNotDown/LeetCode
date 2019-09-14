class Solution:
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = nums[0]
        t = [nums[0]]
        for i in range(1, len(nums)):
            t.append(max(t[-1] + nums[i], nums[i]))
            if t[-1] > ans:
                ans = t[-1]
        return ans
