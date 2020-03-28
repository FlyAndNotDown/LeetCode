/**
 * @no 42
 * @name Trapping Rain Water
 */
class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
            leftMax[i] = max;
        }
        max = 0;
        for (int i = height.length - 1; i > -1; i--) {
            if (height[i] > max) {
                max = height[i];
            }
            rightMax[i] = max;
        }
        int result = 0;
        for (int i = 0; i < height.length; i++) {
            int temp = Math.min(leftMax[i], rightMax[i]);
            result += temp > height[i] ? temp - height[i] : 0;
        }
        return result;
    }
}