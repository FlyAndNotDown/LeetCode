/**
 * @no 64
 * @name Minimum Path Sum
 */
class Solution {
public:
    static int minPathSum(vector<vector<int>>& grid) {
        vector<vector<int>> result;
        for (int i = 0; i < grid.size(); i++) {
            result.push_back(vector<int>(grid[0].size()));
        }
        result[0][0] = grid[0][0];
        for (int i = 1; i < grid.size(); i++) {
            result[i][0] = result[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < grid[0].size(); i++) {
            result[0][i] = result[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < grid.size(); i++) {
            for (int j = 1; j < grid[0].size(); j++) {
                result[i][j] = (result[i - 1][j] > result[i][j - 1] ? result[i][j - 1] : result[i - 1][j]) + grid[i][j];
            }
        }
        return result[result.size() - 1][result[0].size() - 1];
    }
};