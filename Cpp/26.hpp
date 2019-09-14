/**
 * @no 26
 * @name Remove Duplicates from Sorted Array
 */
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        auto i = 0;
        while (i < nums.size()) {
            for (auto j = i + 1; j < nums.size(); j++) {
                if (nums[i] == nums[j]) {
                    for (auto k = j + 1; k < nums.size(); k++) nums[k - 1] = nums[k];
                    nums.pop_back();
                    j--;
                }
            }
            i++;
        }
        return (int) nums.size();
    }
};
