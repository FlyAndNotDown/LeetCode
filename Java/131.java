/**
 * @no 131
 * @name Palindrome Partitioning
 */
class Solution {
    private List<List<String>> result = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtrack(new ArrayList<>(), "", s);
        return result;
    }

    private void backtrack(List<String> log, String buffer, String current) {
        if (current.length() == 0) {
            if (buffer.isEmpty()) {
                result.add(log);
            }
            return;
        }
        String cut = current.substring(0, 1);
        String afterCut = current.substring(1);
        String newBuffer = buffer + cut;
        if (check(newBuffer)) {
            backtrack(new ArrayList<String>(log) {{
                add(newBuffer);
            }}, "", afterCut);
        }
        backtrack(log, newBuffer, afterCut);
    }

    private boolean check(String s) {
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}