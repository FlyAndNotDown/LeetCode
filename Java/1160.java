/**
 * @no 1160
 * @name Find Words That Can Be Formed by Characters
 */
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] hashMap = new int[26];
        for (char c : chars.toCharArray()) {
            hashMap[c - 'a']++;
        }

        int result = 0;
        NEXT_WORD:
        for (String word : words) {
            int[] temp = copyArray(hashMap);
            for (char c : word.toCharArray()) {
                if (temp[c - 'a'] <= 0) {
                    continue NEXT_WORD;
                } else {
                    temp[c - 'a']--;
                }
            }
            result += word.length();
        }
        return result;
    }

    private int[] copyArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}