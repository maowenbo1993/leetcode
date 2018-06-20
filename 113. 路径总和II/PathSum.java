import java.util.*;

class PathSum {
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
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	List<Integer> list = new ArrayList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
 		dfs(root, sum);
 		return res;
    }

    public void dfs(TreeNode root, int sum) {
    	if (root == null) return;
    	list.add(root.val);
 		if (root.left == null && root.right == null && root.val == sum) res.add(new ArrayList<Integer>(list)); 
    	dfs(root.left, sum - root.val);
    	dfs(root.right, sum - root.val);
    	list.remove(list.size() - 1);
    }
}
