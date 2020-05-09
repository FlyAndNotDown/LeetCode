/**
 * @no 1295
 * @name Find Numbers with Even Number of Digits
 */
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            int number = num;
            int count = 0;
            while (number > 0) {
                number = number / 10;
                count++;
            }
            if (count % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}