class MyStack:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.__stack = []

    def push(self, x):
        """
        Push element x onto stack.
        :type x: int
        :rtype: void
        """
        self.__stack.append(x)

    def pop(self):
        """
        Removes the element on top of the stack and returns that element.
        :rtype: int
        """
        returner = self.__stack[-1]
        del self.__stack[-1]
        return returner

    def top(self):
        """
        Get the top element.
        :rtype: int
        """
        return self.__stack[-1]

    def empty(self):
        """
        Returns whether the stack is empty.
        :rtype: bool
        """
        return True if len(self.__stack) == 0 else False


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()