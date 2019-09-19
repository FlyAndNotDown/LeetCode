/**
 * @no 125
 * @name Valid Palindrome
 */
class Solution {
public:
    static bool isPalindrome(string s) {
        string t;
        for (int i = 0; i < s.size(); i++) {
            if ((s.at(i) >= 'a' && s.at(i) <= 'z') || (s.at(i) >= '0' && s.at(i) <= '9')) {
                t.push_back(s.at(i));
            } else if (s.at(i) >= 'A' && s.at(i) <= 'Z') {
                t.push_back(s.at(i) + 32);
            }
        }
        bool result = true;
        for (int i = 0; i < t.size() / 2; i++) {
            if (t.at(i) != t.at(t.size() - 1 - i)) {
                result = false;
            }
        }
        return result;
    }
};