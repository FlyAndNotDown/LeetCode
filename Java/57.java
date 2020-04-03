/**
 * @no 57
 * @name Insert Interval
 */
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> intervalArrays = new ArrayList<>();
        for (int[] interval : intervals) {
            int[] temp = new int[] { interval[0], interval[1] };
            intervalArrays.add(temp);
        }
        intervalArrays.add(new int[] { newInterval[0], newInterval[1] });
        intervalArrays.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        ArrayList<int[]> result = new ArrayList<>();
        for (int[] interval : intervalArrays) {
            if (result.size() == 0) {
                result.add(interval);
            } else {
                int[] last = result.get(result.size() - 1);
                if (last[1] >= interval[0]) {
                    last[1] = Math.max(last[1], interval[1]);
                } else {
                    result.add(interval);
                }
            }
        }
        return result.toArray(new int[0][]);
    }
}