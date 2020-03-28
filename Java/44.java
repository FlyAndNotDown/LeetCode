/**
 * @no 44
 * @name Wildcard Matching
 */
class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i < p.length() + 1; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = dp[0][i - 1];
            }
        }
        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 1; j < p.length() + 1; j++) {
                switch (p.charAt(j - 1)) {
                    case '*':
                        for (int t = 0; t <= i; t++) {
                            if (dp[t][j - 1]) {
                                dp[i][j] = true;
                                break;
                            }
                        }
                        break;
                    case '?':
                        dp[i][j] = dp[i - 1][j - 1];
                        break;
                    default:
                        dp[i][j] = s.charAt(i - 1) == p.charAt(j - 1) && dp[i - 1][j - 1];
                        break;
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}