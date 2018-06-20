public class Flatten {
	public static void main(String[] args) {
		
	}
}

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
 	TreeNode right;
	TreeNode(int x) { val = x; }
}

class Solution {
	TreeNode dummy = null;
	TreeNode cur = dummy;
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = dummy;
        root.left = null;
        dummy = root;
    }
}