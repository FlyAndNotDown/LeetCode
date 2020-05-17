/**
 * @no 228
 * @name Summary Ranges
 */
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<int[]> ranges = new ArrayList<>();
        for (int num : nums) {
            if (ranges.size() == 0) {
                ranges.add(new int[]{num, num});
            } else {
                int[] last = ranges.get(ranges.size() - 1);
                if (num == last[1] + 1) {
                    last[1] = num;
                } else if (num > last[1] + 1) {
                    ranges.add(new int[]{num, num});
                }
            }
        }
        return parseRanges(ranges);
    }

    private List<String> parseRanges(List<int[]> ranges) {
        List<String> result = new ArrayList<>();
        for (int[] range : ranges) {
            int start = range[0];
            int end = range[1];
            if (start == end) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + end);
            }
        }
        return result;
    }
}