import java.util.*;

class SumNumbers {
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
	int sum = 0;

    public int sumNumbers(TreeNode root) {
 		dfs(root, "");
 		return sum;
    }

    public void dfs(TreeNode root, String s) {
    	if (root == null) return;
    	String ss = s + root.val;
 		if (root.left == null && root.right == null) {
 			sum += Integer.parseInt(ss); 
 			return;
 		} 		
    	dfs(root.left, ss);
    	dfs(root.right, ss);
    }
}
