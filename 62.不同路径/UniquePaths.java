public class UniquePaths {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.uniquePaths(7,3));
	}
}
//[dp]
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) dp[i][j] = 1;
                else if (i == 0) dp[i][j] = dp[i][j - 1];
                else {
                    if (j == 0) dp[i][j] = dp[i - 1][j];
                    else {
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    }
                }
            }
        }
        return dp[n - 1][m - 1];
    }
}


//[dfs]
// class Solution {
// 	static int res = 0;
//     public int uniquePaths(int m, int n) {
//         dfs(n, m, 0, 0);
//         return res;
//     }

//     public void dfs(int n, int m, int r, int c) {
//     	if (r == n - 1 && c == m - 1) {
//     		res += 1;
//     		return;
//     	}
//     	if (r >= n || c >= m) return;
//     	dfs(n, m, r, c + 1);
//     	dfs(n, m, r + 1, c);
//     }
// }