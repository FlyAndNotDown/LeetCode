/**
 * @no 75
 * @name Set Matrix Zeros
 */
class Solution {
public:
    void sortColors(vector<int>& nums) {
        vector<int> ones, twos, threes;
        for (auto num : nums) {
            switch (num) {
                case 0:
                    ones.push_back(0);
                    break;
                case 1:
                    twos.push_back(1);
                    break;
                case 2:
                    threes.push_back(2);
                    break;
                default:
                    break;
            }
        }
        nums.clear();
        for (auto num : ones) nums.push_back(num);
        for (auto num : twos) nums.push_back(num);
        for (auto num : threes) nums.push_back(num);
    }
};
