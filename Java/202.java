/**
 * @no 202
 * @name Happy Number
 */
class Solution {
    public static boolean isHappy(int n) {
        int result = 0;
        List<Integer> splitNumbers = Solution.splitNumber(n);
        for (int splitNumber : splitNumbers) {
            result += splitNumber * splitNumber;
        }
        return result == 1 || result == 4 ? result == 1 : isHappy(result);
    }

    private static List<Integer> splitNumber(int number) {
        List<Integer> result = new ArrayList<>();
        while (number > 0) {
            result.add(number % 10);
            number /= 10;
        }
        return result;
    }
}