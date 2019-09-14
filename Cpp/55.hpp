/**
 * @no 55
 * @name Jump Game
 */
class Solution {
public:
    static bool canJump(vector<int>& nums) {
        int last = nums.size() - 1;
        for (int i = nums.size() - 1; i > -1; i--) {
            if (i + nums[i] >= last) {
                last = i;
            }
        }
        return last == 0;
    }
};