/**
 * @no 547
 * @name Friend Circles
 */
class Solution {
    public int findCircleNum(int[][] m) {
        int[] visited = new int[m.length];
        int result = 0;
        for (int i = 0; i < m.length; i++) {
            if (visited[i] == 0) {
                dfs(m, visited, i);
                result++;
            }
        }
        return result;
    }

    private void dfs(int[][] m, int[] visited, int i) {
        for (int j = 0; j < m.length; j++) {
            if (m[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(m, visited, j);
            }
        }
    }
}