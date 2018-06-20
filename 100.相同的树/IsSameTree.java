public class IsSameTree {
	public static void main(String[] args) {
		TreeNode p = new TreeNode(10);
        p.left = new TreeNode(5);
        p.right = new TreeNode(15);
        TreeNode q = new TreeNode(10);
        TreeNode q1 = new TreeNode(5);
        q.left = q1;
        q1.right = new TreeNode(15);
        Solution s = new Solution();
        System.out.print(s.isSameTree(p, q));
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
	boolean isSame = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return isSame;
        else if (p == null || q == null || p.val != q.val) {
        	isSame = false;
        	return isSame;
        }
        isSameTree(p.left, q.left);
        isSameTree(p.right, q.right);
        return isSame; 
    }
}