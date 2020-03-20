/**
 * @no 477
 * @name Total Hamming Distance
 */
class Solution {
    public int totalHammingDistance(int[] nums) {
        int distance = 0;
        while (!over(nums)) {
            int numberOfZero = 0;
            int numberOfOne = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    numberOfZero++;
                } else {
                    numberOfOne++;
                }
                nums[i] /= 2;
            }
            distance += numberOfZero * numberOfOne;
        }
        return distance;
    }

    private boolean over(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                return false;
            }
        }
        return true;
    }
}