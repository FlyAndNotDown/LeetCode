/**
 * @no 18
 * @name 4Sum
 */
class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 4) { return result; }
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) { continue; }
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) { continue; }
            if (nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) { continue; }
            for (int j = i + 1; j < length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) { continue; }
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) { continue; }
                if (nums[i] + nums[j] + nums[length - 2] + nums[length - 1] < target) { continue; }
                int m = j + 1;
                int n = length - 1;
                while (m < n) {
                    int sum = nums[i] + nums[j] + nums[m] + nums[n];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[m], nums[n]));
                        while (m < n && nums[m] == nums[m + 1]) { m++; }
                        while (m < n && nums[n - 1] == nums[n]) { n--; }
                        m++;
                        n--;
                    } else if (sum < target) {
                        m++;
                    } else {
                        n--;
                    }
                }
            }
        }
        return result;
    }
}