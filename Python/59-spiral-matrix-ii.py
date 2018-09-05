class Solution:
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        answer = []
        for _ in range(n):
            t = []
            for __ in range(n): t.append(0)
            answer.append(t)

        count = 0
        top = 0
        bottom = n
        left = -1
        right = n

        direction = 0
        x = 0
        y = 0
        while count < n * n:
            count += 1
            answer[x][y] = count

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

        return answer
