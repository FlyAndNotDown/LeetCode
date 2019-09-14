/**
 * @no 4
 * @name Median of Two Sorted Arrays
 */
public class Solution {
    public double findMedianSortedArrays(int[] m, int[] n) {
        List<Integer> list = new ArrayList<Integer>();
        int p = 0, q = 0;
        int a, b;
        while (p < m.length || q < n.length) {
            if (p == m.length) {
                list.add(n[q]);
                q++;
                continue;
            }
            if (q == n.length) {
                list.add(m[p]);
                p++;
                continue;
            }
            if (m[p] < n[q]) {
                list.add(m[p]);
                p++;
            } else {
                list.add(n[q]);
                q++;
            }
        }
        return list.size() % 2 == 0 ? (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) * 1.0 / 2 : list.get(list.size() / 2);
    }
}
