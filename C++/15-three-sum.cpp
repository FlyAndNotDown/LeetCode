class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> answer;
        if (nums.size() < 3) return answer;
        sort(nums.begin(), nums.end());
        for (auto i = 0; i < nums.size() - 2; i++) if (i == 0 || nums[i] != nums[i - 1]) {
            auto j = i + 1;
            auto k = nums.size() - 1;
            while (j < k) {
                if (j - 1 > i && nums[j] == nums[j - 1]) { j++; continue; }
                if (k + 1 < nums.size() && nums[k] == nums[k + 1]) { k--; continue; }
                auto sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    int array[] = {nums[i], nums[j], nums[k]};
                    answer.emplace_back(vector<int>(array, array + 3));
                    j++;
                    k--;
                } else {
                    if (sum < 0) j++;
                    if (sum > 0) k--;
                }
            }
        }
        return answer;
    }
};
