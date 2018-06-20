public class NumIslands {
	public static void main(String[] args) {
		
	}
}
class Solution {
	int num = 0;
    public int numIslands(char[][] grid) {
    	if (grid == null || grid.length == 0) return 0;
    	int m = grid.length;
    	int n = grid[0].length;
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		if (grid[i][j] == '1') num++;
        		dfs(grid, i, j);
        	}
        }
        return num;
    }
    public void dfs(char[][] grid, int r, int c) {
    	int m = grid.length;
    	int n = grid[0].length;
    	if (r < 0 || r > m - 1 || c < 0 || c > n - 1 || grid[r][c] == '0') return;
    	grid[r][c] = '0';
    	dfs(grid, r, c + 1);
    	dfs(grid, r + 1, c);
    	dfs(grid, r, c - 1);
    	dfs(grid, r - 1, c);
    	return;
    }
}