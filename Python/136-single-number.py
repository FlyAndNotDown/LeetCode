class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = {}
        for num in nums:
            if count.get(str(num)): count[str(num)] += 1
            else: count[str(num)] = 1
        for c in count:
            if count[c] == 1: return int(c)
