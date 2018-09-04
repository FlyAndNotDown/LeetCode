class Solution {
public:
    string longestCommonPrefix(vector<string>& strings) {
        string ans;
        int count = 0;
        while (!strings.empty()) {
            if (count >= strings[0].length()) return ans;
            char temp = strings[0][count];
            for (auto string : strings) {
                if (string[count] != temp) return ans;
            }
            ans.push_back(temp);
            count++;
        }
        return ans;
    }
};
