class Solution:
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        rows = [
            ['q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'],
            ['a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'],
            ['z', 'x', 'c', 'v', 'b', 'n', 'm']
        ]
        lower_words = [word.lower() for word in words]
        ans = []

        for i in range(len(lower_words)):
            success = True
            if lower_words[i][0] in rows[0]:
                for c in lower_words[i]:
                    if c not in rows[0]:
                        success = False

            if lower_words[i][0] in rows[1]:
                for c in lower_words[i]:
                    if c not in rows[1]:
                        success = False

            if lower_words[i][0] in rows[2]:
                for c in lower_words[i]:
                    if c not in rows[2]:
                        success = False

            if success:
                ans.append(words[i])

        return ans


if __name__ == '__main__':
    solution = Solution()
    print(solution.findWords(["Hello", "Alaska", "Dad", "Peace"]))
