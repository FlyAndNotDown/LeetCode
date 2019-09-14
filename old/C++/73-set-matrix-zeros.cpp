class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        vector<vector<int>> zeroLocations;

        for (auto i = 0; i < matrix.size(); i++) {
            for (auto j = 0; j < matrix[i].size(); j++) {
                if (matrix[i][j] == 0) {
                    int tmp[2] = {i, j};
                    vector<int> v(tmp, tmp + 2);
                    zeroLocations.push_back(v);
                }
            }
        }

        for (auto zeroLocation : zeroLocations) {
            int x = zeroLocation[0];
            int y = zeroLocation[1];

            for (auto &i : matrix[x]) i = 0;
            for (auto &i : matrix) i[y] = 0;
        }
    }
};
