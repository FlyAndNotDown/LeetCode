"""
@no 764
@name Largest Plus Sign
"""
class Solution:
    def orderOfLargestPlusSign(self, N, mines):
        """
        :type N: int
        :type mines: List[List[int]]
        :rtype: int
        """
        banned = {tuple(mine) for mine in mines}
        depth = [[0] * N for _ in range(N)]
        answer = 0

        for row in range(N):
            count = 0
            for col in range(N):
                count = 0 if (row, col) in banned else count + 1
                depth[row][col] = count

            count = 0
            for col in range(N - 1, -1, -1):
                count = 0 if (row, col) in banned else count + 1
                if count < depth[row][col]:
                    depth[row][col] = count

        for col in range(N):
            count = 0
            for row in range(N):
                count = 0 if (row, col) in banned else count + 1
                if count < depth[row][col]:
                    depth[row][col] = count

            count = 0
            for row in range(N - 1, -1, -1):
                count = 0 if (row, col) in banned else count + 1
                if count < depth[row][col]:
                    depth[row][col] = count
                if depth[row][col] > answer:
                    answer = depth[row][col]

        return answer
