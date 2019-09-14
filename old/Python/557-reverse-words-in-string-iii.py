class Solution:
    def reverseString(self, l):
        """
        :type l: str
        :rtype: str
        """
        l = list(l)
        for i in range(len(l) // 2):
            t = l[i]
            l[i] = l[-(i + 1)]
            l[-(i + 1)] = t
        return ''.join(l)

    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        words = s.split(' ')
        l = list()
        for word in words:
            l.append(self.reverseString(word))
        answer = ''
        for i in range(len(l)):
            answer += l[i] + ' ' if i != len(l) - 1 else l[i]
        return answer
