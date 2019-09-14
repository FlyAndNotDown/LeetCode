class Solution:
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = {}
        for num in nums:
            if count.get(str(num)):
                count[str(num)] += 1
            else:
                count[str(num)] = 1
            if count[str(num)] > len(nums) // 2:
                return num
        return None
