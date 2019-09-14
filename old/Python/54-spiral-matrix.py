class Solution:
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        ans = list()
        length = 0
        for m in matrix:
            for i in m:
                length += 1

        top = 0
        bottom = len(matrix)
        if bottom == 0: return list()
        left = -1
        right = len(matrix[0])

        direction = 0
        x = 0
        y = 0
        while (len(ans) < length):
            ans.append(matrix[x][y])

            if direction == 0:
                if y + 1 >= right:
                    direction = 1
                    right -= 1
            elif direction == 1:
                if x + 1 >= bottom:
                    direction = 2
                    bottom -= 1
            elif direction == 2:
                if y - 1 <= left:
                    direction = 3
                    left += 1
            elif direction == 3:
                if x - 1 <= top:
                    direction = 0
                    top += 1

            if direction == 0: y += 1
            elif direction == 1: x += 1
            elif direction == 2: y -= 1
            elif direction == 3: x -= 1

        return ans
