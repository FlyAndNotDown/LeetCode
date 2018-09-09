class Solution:
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums) == 0:
            return []
        if len(nums) == 1:
            return [[nums[0]]]
        ans = []
        for i in range(len(nums)):
            t = []
            for j in range(len(nums)):
                if i != j:
                    t.append(nums[j])
            sets = self.permute(t)
            for set in sets:
                set.insert(0, nums[i])
                ans.append(set)
        return ans
