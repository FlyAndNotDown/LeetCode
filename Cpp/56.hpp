/**
 * @no 56
 * @name Merge Intervals
 */
class Solution {
public:
	vector<Interval> merge(vector<Interval>& intervals) {
		vector<Interval> ans;
		Interval tmp;

		sort(intervals.begin(), intervals.end(), [](Interval i, Interval j) -> bool {
			return i.start > j.start;
		});

		while (intervals.size() > 0) {
			tmp = intervals.back();
			intervals.pop_back();
			if (ans.size() > 0) {
				if (tmp.start >= ans.back().start && tmp.start <= ans.back().end) {
					ans.back().end = ans.back().end > tmp.end ? ans.back().end : tmp.end;
				} else {
					ans.push_back(tmp);
				}
			} else {
				ans.push_back(tmp);
			}
		}

		return ans;
	}
};
