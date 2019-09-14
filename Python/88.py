"""
@no 88
@name Merge Sorted Array
"""
class Solution:
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        for i in range(0, n):
            if m + i == 0:
                nums1[0] = nums2[i]
            if nums2[i] > nums1[m + i - 1]:
                nums1[m + i] = nums2[i]
            else:
                for j in range(0, m + i):
                    if (nums2[i] <= nums1[j]):
                        for k in range(m + i, j, -1):
                            nums1[k] = nums1[k - 1]
                        nums1[j] = nums2[i]
                        break
