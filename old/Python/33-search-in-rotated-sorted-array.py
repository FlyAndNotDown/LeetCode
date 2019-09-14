class Solution:
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if len(nums) == 0: return -1
        mid = len(nums) - 1
        for i in range(len(nums) - 1):
            if nums[i] > nums[i + 1]:
                mid = i
                break
        if target == nums[mid]:
            return mid
        elif target == nums[0]:
            return 0
        elif target > nums[0]:
            return self.binarySearch(nums, 0, mid, target)
        elif target < nums[0]:
            return self.binarySearch(nums, mid + 1, len(nums), target)


    def binarySearch(self, nums, i, j, target):
        if i >= j:
            return -1
        else:
            mid = (i + j - 1) // 2
            if target < nums[mid]:
                return self.binarySearch(nums, i, mid, target)
            elif target > nums[mid]:
                return self.binarySearch(nums, mid + 1, j, target)
            else:
                return mid
