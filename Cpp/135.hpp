/**
 * @no 135
 * @name Candy
 */
class Solution {
public:
    static int candy(vector<int>& ratings) {
        if (ratings.size() == 0) { return 0; }
        if (ratings.size() == 1) { return 1; }

        vector<vector<int>> sortedRatingWithPositions;
        for (int i = 0; i < ratings.size(); i++) {
            vector<int> temp;
            temp.push_back(ratings[i]);
            temp.push_back(i);
            sortedRatingWithPositions.push_back(temp);
        }

        sort(sortedRatingWithPositions.begin(), sortedRatingWithPositions.end(), [](vector<int> a, vector<int> b) -> bool {
            return a[0] < b[0];
        });

        vector<int> result(ratings.size(), 1);
        for (vector<int> ratingWithPosition : sortedRatingWithPositions) {
            int position = ratingWithPosition[1];
            if (position == 0) {
                if (ratings[position] > ratings[position + 1] && result[position] <= result[position + 1]) {
                    result[position] = result[position + 1] + 1;
                }
            } else if (position == ratings.size() - 1) {
                if (ratings[position] > ratings[position - 1] && result[position] <= result[position - 1]) {
                    result[position] = result[position - 1] + 1;
                }
            } else {
                if (ratings[position] > ratings[position + 1] && result[position] <= result[position + 1]) {
                    result[position] = result[position + 1] + 1;
                }
                if (ratings[position] > ratings[position - 1] && result[position] <= result[position - 1]) {
                    result[position] = result[position - 1] + 1;
                }
            }
        }
        
        int output = 0;
        for (int t : result) { output += t; }
        return output;
    }
};