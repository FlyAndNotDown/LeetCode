/**
 * @no 20
 * @name Valid Parentheses
 */
class Solution {
public:
    bool isValid(string input) {
        list<char> stack;
        for (auto c : input) {
            if (c == '{') stack.push_back(c);
            if (c == '[') stack.push_back(c);
            if (c == '(') stack.push_back(c);
            if (c == '}') { if (!stack.empty() && stack.back() == '{') stack.pop_back(); else return false; }
            if (c == ']') { if (!stack.empty() && stack.back() == '[') stack.pop_back(); else return false; }
            if (c == ')') { if (!stack.empty() && stack.back() == '(') stack.pop_back(); else return false; }
        }
        return stack.empty();
    }
};
