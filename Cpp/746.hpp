/**
 * @no 746
 * @name Min Cost Climbing Stairs
 */
class Solution {
public:
    static int minCostClimbingStairs(vector<int>& cost) {
        vector<int> result;
        result.push_back(0);
        result.push_back(0);
        for (int i = 0; i < cost.size(); i++) {
            int p = result[i + 2 - 1] + cost[i];
            int q = result[i + 2 - 2] + cost[i];
            result.push_back(p > q ? q : p);
        }
        return result[result.size() - 1] > result[result.size() - 2] ? result[result.size() - 2] : result[result.size() - 1];
    }
};