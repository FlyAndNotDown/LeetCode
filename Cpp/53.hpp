/**
 * @no 53
 * @name Maximum Subarray
 */
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int max, temp = 0;
        bool inited = false;
        for (int i = 0; i < nums.size(); i++) {
            temp = temp + nums[i] > nums[i] ? temp + nums[i] : nums[i];
            if (inited) {
                if (temp > max) { max = temp; }
            } else {
                max = temp;
                inited = true;
            }
        }
        return max;
    }
};