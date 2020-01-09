/**
 * @no 495
 * @name Teemo Attacking
 */
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }
        if (timeSeries.length == 1) {
            return duration;
        }
        int result = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            int subtractionResult = timeSeries[i] - timeSeries[i - 1];
            if (subtractionResult > duration) {
                result += duration;
            } else {
                result += timeSeries[i] - timeSeries[i - 1];
            }
        }
        result += duration;
        return result;
    }
}