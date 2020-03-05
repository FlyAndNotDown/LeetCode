/**
 * @no 1103
 * @name Distribute Candies to People
 */
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int i = 0;
        while (candies > 0) {
            if (candies <= i + 1) {
                result[i % num_people] += candies;
                candies = 0;
            } else {
                result[i % num_people] += i + 1;
                candies -= i + 1;
            }
            i++;
        }
        return result;
    }
}