/**
 * @no 435
 * @name Non-overlapping Intervals
 */
class Solution {
public:
    static int eraseOverlapIntervals(vector<vector<int>>& intervals) {
        if (intervals.size() == 0) { return 0; }
        sort(intervals.begin(), intervals.end(), [](vector<int> a, vector<int> b) -> bool { return a[1] < b[1]; });
        int p = intervals[0][1];
        int count = 0;
        for (int i = 1; i < intervals.size(); i++) {
            if (p <= intervals[i][0]) { p = intervals[i][1]; }
            else { count++; }
        }
        return count;
    }
};