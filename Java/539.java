/**
 * @no 539
 * @name Minimum Time Difference
 */
class Solution {
    public static int findMinDifference(List<String> timePoints) {
        List<Integer> times = new ArrayList<>();
        for (String timePoint : timePoints) {
            times.add(parseTime(timePoint));
        }
        times.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        times.add(times.get(0) + 24 * 60);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < times.size() - 1; i++) {
            result.add(times.get(i + 1) - times.get(i));
        }
        result.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        return result.get(0);
    }

    private static int parseTime(String time) {
        String[] splitTemp = time.split(":");
        return Integer.parseInt(splitTemp[0]) * 60 + Integer.parseInt(splitTemp[1]);
    }
}