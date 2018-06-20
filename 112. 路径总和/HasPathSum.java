import java.util.*;

class HasPathSum {
	public static void main(String[] args) {
		
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

//[dfs]
class Solution {
	boolean hasSum = false;

    public boolean hasPathSum(TreeNode root, int sum) {
 		dfs(root, sum);
 		return hasSum;
    }

    public void dfs(TreeNode root, int sum) {
    	if (root == null) return;
 		if (root.left == null && root.right == null && root.val == sum) hasSum = true; 
    	dfs(root.left, sum - root.val);
    	dfs(root.right, sum - root.val);
    }
}
