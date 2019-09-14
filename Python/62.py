"""
@no 62
@name Unique Paths
"""
class Solution:
    def uniquePaths(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        log = [[0 for __ in range(n + 1)] for _ in range(m + 1)]
        start = [0, 0]
        finish = [m -1, n - 1]
        for i in range(m - 1, -1, -1):
            for j in range(n - 1, -1, -1):
                if i == m - 1 and j == n - 1:
                    log[i][j] = 1
                else:
                    log[i][j] = log[i + 1][j] + log[i][j + 1]
        return log[start[0]][start[1]]
