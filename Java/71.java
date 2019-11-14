/**
 * @no 71
 * @name Simplify Path
 */
class Solution {
    public static String simplifyPath(String path) {
        String[] dirs = path.replaceAll("/+", "/").split("/");
        Stack<String> stack = new Stack<>();
        Stack<String> temp = new Stack<>();
        for (String dir : dirs) {
            if (dir.equals("..")) {
                if (!stack.empty()) { stack.pop(); }
                continue;
            }
            if (!dir.isEmpty() && !dir.equals(".")) { stack.push(dir); }
        }
        while (!stack.empty()) {
            temp.push(stack.pop());
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!temp.empty()) {
            stringBuilder.append("/").append(temp.pop());
        }
        String result = stringBuilder.toString();
        return result.isEmpty() ? "/" : result;
    }
}