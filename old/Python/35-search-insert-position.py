class Solution:
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if len(nums) == 0:
            return 0
        else:
            for i in range(len(nums)):
                if target <= nums[i]:
                    return i
            return len(nums)


if __name__ == '__main__':
    solution = Solution()
    print(solution.searchInsert([1,3,5,6], 5))

