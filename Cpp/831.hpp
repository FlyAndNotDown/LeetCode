/**
 * @no 831
 * @name Masking Personal Information
 */
class Solution {
public:
    static string maskPII(string s) {
        string result;
        bool findAt = false;
        for (char c : s) { if (c == '@') { findAt = true; } }

        if (findAt) {
            findAt = false;
            for (int i = 0; i < s.length(); i++) {
                if (findAt) {
                    result.push_back(Solution::toLowerCase(s[i]));
                } else {
                    if (i == 0) {
                        result.push_back(Solution::toLowerCase(s[i]));
                        for (int j = 0; j < 5; j++) { result.push_back('*'); }
                    } else if (s[i] == '@') {
                        findAt = true;
                        result.push_back(Solution::toLowerCase(s[i - 1]));
                        result.push_back(Solution::toLowerCase(s[i]));
                    }
                }
            }
        } else {
            string temp;
            int count = 0;
            for (int i = s.length() - 1; i > -1; i--) {
                if (Solution::isNumber(s[i])) {
                    count++;
                    if (count < 4) {
                        temp.push_back(s[i]);
                    } else if (count == 4) {
                        temp.push_back(s[i]);
                        temp.push_back('-');
                    } else if (count < 7) {
                        temp.push_back('*');
                    } else if (count == 7) {
                        temp.push_back('*');
                        temp.push_back('-');
                    } else if (count <= 10) {
                        temp.push_back('*');
                    } else if (count == 11) {
                        temp.push_back('-');
                        temp.push_back('*');
                    } else if (count > 11) {
                        temp.push_back('*');
                    }
                }
            }

            if (count > 10) {
                temp.push_back('+');
            }

            for (int i = temp.length() - 1; i > -1; i--) {
                result.push_back(temp[i]);
            }
        }

        return result;
    }

    static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return c + 32;
        } else {
            return c;
        }
    }

    static bool isNumber(char c) {
        return c >= '0' && c <= '9';
    }
};