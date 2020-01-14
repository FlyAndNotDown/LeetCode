/**
 * @no 506
 * @name Relative Ranks
 */
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        final String[] rankTemplates = new String[] { "Gold Medal", "Silver Medal", "Bronze Medal" };
        Map<Integer, Integer> gradeToIdMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            gradeToIdMap.put(nums[i], i);
        }
        List<Integer> grades = new ArrayList<>(gradeToIdMap.keySet());
        grades.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });
        String[] result = new String[nums.length];
        for (int i = 0; i < grades.size(); i++) {
            if (i <= 2) {
                result[gradeToIdMap.get(grades.get(i))] = rankTemplates[i];
            } else {
                result[gradeToIdMap.get(grades.get(i))] = Integer.toString(i + 1);
            }
        }
        return result;
    }
}