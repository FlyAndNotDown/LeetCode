class MinStack:
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.__stack = list()
        self.__min_stack = list()

    def push(self, x):
        """
        :type x: int
        :rtype: void
        """
        self.__stack.append(x)
        if len(self.__min_stack) == 0:
            self.__min_stack.append(x)
        elif x <= self.__min_stack[-1]:
            self.__min_stack.append(x)

    def pop(self):
        """
        :rtype: void
        """
        top = self.__stack[-1]
        self.__stack.pop()
        if top == self.__min_stack[-1]:
            self.__min_stack.pop()

    def top(self):
        """
        :rtype: int
        """
        return self.__stack[-1]

    def getMin(self):
        """
        :rtype: int
        """
        return self.__min_stack[-1]

