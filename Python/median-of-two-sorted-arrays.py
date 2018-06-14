class Solution:
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        l = []
        l += nums1
        l += nums2
        l.sort()
        if len(l) == 0:
            return 0
        else:
            return float(l[len(l) // 2]) if len(l) % 2 == 1 else (l[len(l) // 2] + l[len(l) // 2 - 1]) / 2
