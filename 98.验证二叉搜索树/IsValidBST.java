import java.util.*;
public class IsValidBST {
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
    boolean flag = true;
    long value = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return flag;
        isValidBST(root.left);
        if (root.val <= value) flag = false;
        else value = root.val;
        isValidBST(root.right);
        return flag;     
    }
}