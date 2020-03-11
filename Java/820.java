/**
 * @no 820
 * @name Short Encoding of Words
 */
class Solution {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.length() - a.length();
            }
        });
        StringBuilder s = new StringBuilder();
        for (String word : words) {
            int index = s.indexOf(word + "#");
            if (index == -1) {
                s.append(word).append("#");
            }
        }
        return s.length();
    }
}