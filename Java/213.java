/**
 * @no 213
 * @name House Robber II
 */
class Solution {
    public int rob(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp1 = new int[nums.length + 2];
        int[] dp2 = new int[nums.length + 2];
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                dp1[i + 2] = dp1[i + 1];
            } else {
                int max = getMax(dp1, 0, i + 1);
                dp1[i + 2] = Math.max(dp1[i + 1], max + nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                dp2[i + 2] = 0;
            } else {
                int max = getMax(dp2, 0, i + 1);
                dp2[i + 2] = Math.max(dp2[i + 1], max + nums[i]);
            }
        }
        return Math.max(dp1[nums.length + 1], dp2[nums.length + 1]);
    }

    private int getMax(int[] array, int left, int right) {
        int max = Integer.MIN_VALUE;
        for (int i = left; i < right; i++) {
            max = Math.max(array[i], max);
        }
        return max;
    }
}