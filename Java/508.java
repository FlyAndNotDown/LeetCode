/**
 * @no 508
 * @name Most Frequent Subtree Sum
 */
class Solution {
    public static int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) {
            return new int[] {};
        }

        Map<Integer, Integer> frequentTreeSum = new HashMap<>();
        getFrequentTreeSum(root, frequentTreeSum);
        int max = -1;
        for (int key : frequentTreeSum.keySet()) {
            int frequent = frequentTreeSum.get(key);
            if (frequent > max) {
                max = frequent;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int key : frequentTreeSum.keySet()) {
            if (frequentTreeSum.get(key) == max) {
                result.add(key);
            }
        }
        int[] arrayResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arrayResult[i] = result.get(i);
        }
        return arrayResult;
    }

    private static int getFrequentTreeSum(TreeNode root, Map<Integer, Integer> result) {
        if (root == null) {
            return 0;
        }
        int sum = getFrequentTreeSum(root.left, result) + getFrequentTreeSum(root.right, result) + root.val;
        if (result.containsKey(sum)) {
            result.replace(sum, result.get(sum) + 1);
        } else {
            result.put(sum, 1);
        }
        return sum;
    }
}