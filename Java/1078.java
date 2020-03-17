/**
 * @no 1078
 * @name Occurrences After Bigram
 */
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] words = text.split(" ");
        int i = 0;
        boolean findFirst = false;
        boolean findSecond = false;
        while (i < words.length) {
            if (words[i].equals(first)) {
                if (findSecond) {
                    list.add(words[i]);
                }
                findFirst = true;
                findSecond = false;
            } else if (words[i].equals(second)) {
                if (findSecond) {
                    list.add(words[i]);
                    findFirst = false;
                    findSecond = false;
                }
                if (findFirst) {
                    findSecond = true;
                }
            } else {
                if (findSecond) {
                    list.add(words[i]);
                }
                findFirst = false;
                findSecond = false;
            }
            i++;
        }
        return list.toArray(new String[0]);
    }
}