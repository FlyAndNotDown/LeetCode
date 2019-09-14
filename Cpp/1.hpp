/**
 * @no 1
 * @name Two Sum
 */
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> ans;
        for (int i = (int) (nums.size() - 1); i > -1; i--) {
            for (auto j = i - 1; j > -1; j--) {
                if (nums[i] + nums[j] == target) {
                    ans.push_back(i);
                    ans.push_back(j);
                    return ans;
                }
            }
        }
        return ans;
    }
};
