public class MaxPathSum {
	public static void main(String[] args) {
		
	}
}

class TreeNode {
	int val;
	TreeNode left;
 	TreeNode right;
 	TreeNode(int x) { val = x; }
}

class Solution {
	int maxValue = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxValue;
    }

    public int dfs(TreeNode root) {
    	if (root == null) return 0;
    	int left = dfs(root.left);
    	int right = dfs(root.right);
    	if (left + right + root.val > maxValue) maxValue = left + right + root.val;
    	if (left > right) {
    		return (left + root.val > 0) ? left + root.val : 0;
    	} else {
    		return (right + root.val > 0) ? right + root.val : 0;
    	}
    }
}