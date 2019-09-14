"""
@no 539
@name Minimum Time Difference
"""
class Solution:
    def findMinDifference(self, timePoints):
        """
        :type timePoints: List[str]
        :rtype: int
        """
        minutes = [int(time[0:2]) * 60 + int(time[3:5]) for time in timePoints]
        minutes.sort()

        ans = 24 * 60
        for i in range(0, len(minutes) - 1):
            tmp = minutes[i + 1] - minutes[i]
            if tmp < ans:
                ans = tmp
        tmp = minutes[0] + 24 * 60 - minutes[-1]
        if tmp < ans:
            ans = tmp

        return ans
