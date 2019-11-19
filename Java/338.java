/**
 * @no 338
 * @name Counting Bits
 */
class Solution {
    public int[] countBits(int num) {
        if (num == 0) {
            return new int[] { 0 };
        }
        if (num == 1) {
            return new int[] { 0, 1 };
        }
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= num; i++) {
            if ((i & 1) == 1) {
                list.add(list.get(i - 1) + 1);
            } else {
                list.add(list.get(i / 2));
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}