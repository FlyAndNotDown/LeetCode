class Solution:
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        answer = list()
        left = list()
        right = list()
        factor = 1
        for num in nums:
            factor = factor * num
            left.append(factor)
        factor = 1
        for i in range(len(nums) - 1, -1, -1):
            factor = factor * nums[i]
            right.append(factor)
        right.reverse()
        for i in range(len(nums)):
            if i == 0: answer.append(right[i + 1])
            elif i == len(nums) - 1: answer.append(left[i - 1])
            else: answer.append(left[i - 1] * right[i + 1])
        return answer
