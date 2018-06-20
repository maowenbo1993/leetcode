import java.util.*;
public class InorderTraversal {
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
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return res;
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
        return res;     
    }
}

