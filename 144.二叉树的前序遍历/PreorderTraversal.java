import java.util.*;

class PreorderTraversal {
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
	List<Integer> res = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {
 		dfs(root);
 		return res;
    }

    public void dfs(TreeNode root) {
    	if (root == null) return;
 		res.add(root.val);
    	dfs(root.left);
    	dfs(root.right);
    }
}
