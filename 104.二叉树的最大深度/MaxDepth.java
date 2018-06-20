public class MaxDepth {
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
	int deep = 0;
	int max = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) {
        	return deep;
        }
        max = Math.max(++deep, max);
        maxDepth(root.left);
        maxDepth(root.right);
        deep--;
        return max;
    }
}