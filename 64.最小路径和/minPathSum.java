public class minPathSum {
	public static void main(String[] args) {
		Solution s = new Solution();
        int[][] a = {{0,1},{1,0}};
		System.out.println(s.minPathSum(a));
	}
}

//[dp]
class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) dp[i][j] = grid[i][j];
                else if (i == 0) dp[i][j] = dp[i][j - 1] + grid[i][j];
                else {
                    if (j == 0) dp[i][j] = dp[i - 1][j] + grid[i][j];
                    else {
                        dp[i][j] = ((dp[i][j - 1] < dp[i - 1][j]) ? dp[i][j - 1] : dp[i - 1][j]) + grid[i][j];
                    }
                }
            }
        }
        return dp[n - 1][m - 1];
    }
}


//[dfs]
// class Solution {
// 	static int res = Integer.MAX_VALUE;
//     public int minPathSum(int[][] grid) {
//         if (grid.length == 1 && grid[0].length == 1) return grid[0][0];
//         dfs(grid, 0, 0, 0);
//         return res;
//     }

//     public void dfs(int[][] grid, int sum, int r, int c) {
//     	if (r == grid.length - 1 && c == grid[0].length - 1) {
//     		if (sum + grid[r][c] < res) res = sum + grid[r][c];
//     		return;
//     	}
//     	if (r > grid.length - 1 || c > grid[0].length - 1) return;
//     	dfs(grid, sum + grid[r][c], r, c + 1);
//     	dfs(grid, sum + grid[r][c], r + 1, c);
//     }
// }