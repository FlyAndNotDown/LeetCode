"""
@no 463
@name Island Perimeter
"""
class Solution:
    def islandPerimeter(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        ans = 0
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                if grid[i][j] == 1:
                    if i - 1 < 0 or grid[i - 1][j] == 0: ans += 1
                    if i + 1 > len(grid) - 1 or grid[i + 1][j] == 0: ans += 1
                    if j - 1 < 0 or grid[i][j - 1] == 0: ans += 1
                    if j + 1 > len(grid[i]) - 1 or grid[i][j + 1] == 0: ans += 1
        return ans
