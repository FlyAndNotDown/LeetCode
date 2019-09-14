/**
 * @no 48
 * @name Rotate Image
 */
class Solution {
public:
    static void rotate(vector<vector<int>>& matrix) {
        int temp;
        vector<vector<bool>> flags;
        for (int i = 0; i < matrix.size(); i++) {
            vector<bool> v;
            for (int j = 0; j < matrix.size(); j++) {
                v.push_back(false);
            }
            flags.push_back(v);
        }
        for (unsigned int i = 0; i < matrix.size(); i++) {
            for (unsigned int j = 0; j < matrix.size(); j++) {
                if (!flags[i][j]) {
                    temp = matrix[matrix.size() - 1 - j][i];
                    matrix[matrix.size() - 1 - j][i] = matrix[matrix.size() - 1 - i][matrix.size() - 1 - j];
                    matrix[matrix.size() - 1 - i][matrix.size() - 1 - j] = matrix[j][matrix.size() - 1 - i];
                    matrix[j][matrix.size() - 1 - i] = matrix[i][j];
                    matrix[i][j] = temp;
                    flags[i][j] = true;
                    flags[j][matrix.size() - 1 - i] = true;
                    flags[matrix.size() - 1 - i][matrix.size() - 1 - j] = true;
                    flags[matrix.size() - 1 - j][i] = true;
                }
            }
        }
    }
};