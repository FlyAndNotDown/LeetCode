/**
 * @no 914
 * @name X of a Kind in a Deck of Cards
 */
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int d : deck) {
            if (count.containsKey(d)) {
                count.replace(d, count.get(d) + 1);
            } else {
                count.put(d, 1);
            }
        }
        List<Integer> values = new ArrayList<>(count.values());
        if (values.size() == 1) {
            return values.get(0) > 1;
        }
        int factor = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            factor = gcd(factor, values.get(i));
        }
        return factor != 1;
    }

    private int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a == 0 ? b : a;
    }
}