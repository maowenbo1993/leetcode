public class UniquePathsWithObstacles {
	public static void main(String[] args) {
		Solution s = new Solution();
        int[][] a = new int[1][1];
        
		System.out.println(s.uniquePathsWithObstacles(a));
	}
}


class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
                    else {
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
        }
        return dp[n - 1][m - 1];
    }
}

// [dfs]
// class Solution {
// 	static int res = 0;
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         dfs(obstacleGrid, 0, 0);
//         return res;
//     }

//     public void dfs(int[][] obstacleGrid, int r, int c) {
//     	if (r == obstacleGrid.length - 1 && c == obstacleGrid[0].length - 1) {
//     		res += 1;
//     		return;
//     	}
//     	if (r > obstacleGrid.length - 1 || c > obstacleGrid[0].length - 1 || obstacleGrid[r][c] == 1) return;
//     	dfs(obstacleGrid, r, c + 1);
//     	dfs(obstacleGrid, r + 1, c);
//     }
// }//baobao go back 