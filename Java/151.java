/**
 * @no 151
 * @name Reverse Words in a String
 */
class Solution {
    public String reverseWords(String s) {
        String stringAfterPreDeal = preDeal(s);
        String[] splits = stringAfterPreDeal.replaceAll(" +", " ").split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = splits.length - 1; i > -1; i--) {
            stringBuilder.append(splits[i]);
            if (i != 0) {
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }

    private String preDeal(String s) {
        boolean allSpace = true;
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                allSpace = false;
                break;
            }
        }
        if (allSpace) {
            return "";
        }
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) != ' ') {
                break;
            }
            i++;
        }
        s = s.substring(i);
        i = s.length() - 1;
        while (i > -1) {
            if (s.charAt(i) != ' ') {
                break;
            }
            i--;
        }
        s = s.substring(0, i + 1);
        return s;
    }
}