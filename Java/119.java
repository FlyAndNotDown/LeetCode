/**
 * @no 119
 * @name Pascal's Triangle II
 */
class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        if (rowIndex == 0) {
            result.add(1);
        } else if (rowIndex == 1) {
            result.add(1);
            result.add(1);
        } else {
            List<Integer> lastRow = getRow(rowIndex - 1);
            result.add(1);
            for (int i = 0; i < lastRow.size() - 1; i++) {
                result.add(lastRow.get(i) + lastRow.get(i + 1));
            }
            result.add(1);
        }
        return result;
    }
}