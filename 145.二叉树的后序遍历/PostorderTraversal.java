import java.util.*;

class PostorderTraversal {
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

    public List<Integer> postorderTraversal(TreeNode root) {
 		dfs(root);
 		return res;
    }

    public void dfs(TreeNode root) {
    	if (root == null) return;
    	dfs(root.left);
    	dfs(root.right);
    	res.add(root.val);
    }
}
