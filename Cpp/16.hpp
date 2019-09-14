/**
 * @no 16
 * @name Three Sum Closest
 */
class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        auto answer = nums[0] + nums[1] + nums[2];
        auto result = target > answer ? target - answer : answer - target;
        sort(nums.begin(), nums.end());
        for (auto i = 0; i < nums.size() - 2; i++) if (i == 0 || nums[i] != nums[i - 1]) {
                auto j = i + 1;
                auto k = nums.size() - 1;
                while (j < k) {
                    if (j - 1 > i && nums[j] == nums[j - 1]) { j++; continue; }
                    if (k + 1 < nums.size() && nums[k] == nums[k + 1]) { k--; continue; }
                    auto sum = nums[i] + nums[j] + nums[k];
                    auto tmp = target > sum ? target - sum : sum - target;
                    if (tmp < result) {
                        answer = nums[i] + nums[j] + nums[k];
                        result = tmp;
                        if (sum < target) j++;
                        if (sum >= target) k--;
                    } else {
                        if (sum < target) j++;
                        if (sum >= target) k--;
                    }
                }
            }
        return answer;
    }
};
