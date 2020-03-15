/**
 * @no 1239
 * @name Maximum Length of a Concatenated String with Unique Characters
 */
class Solution {
    List<String> array;
    int mark = 0;
    int length = 0;
    int result = 0;

    public int maxLength(List<String> arr) {
        array = arr;
        array.add(0, "");
        backtrack(0);
        return result;
    }

    private void backtrack(int i) {
        if (i >= array.size()) {
            result = Math.max(result, length);
            return;
        }
        if (checkSelfRepeat(array.get(i))) {
            backtrack(i + 1);
        } else {
            int flag = getFlag(array.get(i));
            if ((mark & flag) == 0) {
                int markSave = mark;
                mark = mark | flag;
                length += array.get(i).length();
                backtrack(i + 1);
                mark = markSave;
                length -= array.get(i).length();
                backtrack(i + 1);
            } else {
                backtrack(i + 1);
            }
        }
    }

    private boolean checkSelfRepeat(String string) {
        int flag = 0;
        for (char c : string.toCharArray()) {
            int t = 1 << (c - 'a');
            if ((flag & t) == t) {
                return true;
            }
            flag |= t;
        }
        return false;
    }

    private int getFlag(String string) {
        int flag = 0;
        for (char c : string.toCharArray()) {
            flag |= 1 << (c - 'a');
        }
        return flag;
    }
}