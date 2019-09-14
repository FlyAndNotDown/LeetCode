"""
@no 20
@name Valid Parentheses
"""
class Solution:
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        for i in range(len(s)):
            if s[i] == '(' or s[i] == '[' or s[i] == '{':
                stack.append(s[i])
            if s[i] == ')' or s[i] == ']' or s[i] == '}':
                if len(stack) == 0:
                    return False
                else:
                    if stack[-1] == '(' and s[i] == ')' or\
                        stack[-1] == '[' and s[i] == ']' or\
                            stack[-1] == '{' and s[i] == '}':
                        stack.pop()
                    else:
                        return False
        if len(stack) == 0:
            return True
        else:
            return False
