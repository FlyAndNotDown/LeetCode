class Solution {
public:
    int maxArea(vector<int>& height) {
        int ans = 0;
        for (int i = 0; i < (int) height.size() - 1; i++) {
            for (int j = (int) height.size() - 1; j > -1; j--) {
                if (height[j] > height[i]) {
                    auto sum = height[i] * (j - i);
                    if (sum > ans) ans = sum;
                    break;
                } else {
                    auto sum = height[j] * (j - i);
                    if (sum > ans) ans = sum;
                }
            }
        }
        return ans;
    }
};
