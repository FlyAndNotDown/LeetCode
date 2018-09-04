class Solution {
public:
    string longestPalindrome(string s) {
        int max = 0;
        string ans;

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i - count > -1 && i + count < s.length() && s[i - count] == s[i + count])
                count++;
            int length = count * 2 - 1;
            if (length > max) {
                max = length;
                ans = s.substr((unsigned long long int) (i - count + 1), (unsigned long long int) (count * 2 - 1));
            }
        }

        for (int i = 1; i < s.length(); i++) {
            if (s[i - 1] == s[i]) {
                int count = 1;
                while (i - 1 - count > -1 && i + count < s.length() && s[i - 1 - count] == s[i + count]) count++;
                int length = count * 2;
                if (length > max) {
                    max = length;
                    ans = s.substr((unsigned long long int) (i - count), (unsigned long long int) (count * 2));
                }
            }
        }

        return ans;
    }
};
