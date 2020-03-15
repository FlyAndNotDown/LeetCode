/**
 * @no 638
 * @name Shopping Offers
 */
class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int cost = 0;
        for (int i = 0; i < price.size(); i++) {
            cost += price.get(i) * needs.get(i);
        }
        if (cost == 0) {
            return cost;
        }

        NEXT_SEPCIAL:
        for (int i = 0; i < special.size(); i++) {
            List<Integer> spe = special.get(i);
            for (int j = 0; j < spe.size() - 1; j++) {
                if (spe.get(j) > needs.get(j)) {
                    continue NEXT_SEPCIAL;
                }
            }
            List<Integer> nowNeeds = new ArrayList<>(needs);
            for (int j = 0; j < spe.size() - 1; j++) {
                nowNeeds.set(j, nowNeeds.get(j) - spe.get(j));
            }
            cost = Math.min(cost, spe.get(spe.size() - 1) + shoppingOffers(price, special, nowNeeds));
        }

        return cost;
    }
}