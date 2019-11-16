/**
 * @no 303
 * @name Range Sum Query - Immutable
 */
class NumArray {
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int result = 0;
        for (int p = i; p <= j; p++) {
            result += this.nums[p];
        }
        return result;
    }
}