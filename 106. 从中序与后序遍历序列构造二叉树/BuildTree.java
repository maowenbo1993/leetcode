import java.util.*;
public class BuildTree {
	public static void main(String[] args) {
		int[] inorder = {9,3,15,20,7};
		int[] postorder = {9,15,7,20,3};
		Solution s = new Solution();

		dfs(s.buildTree(inorder, postorder));
	}
	public static void dfs(TreeNode root) {
		if (root == null) return;
		
		dfs(root.left);
        System.out.println(root.val);
		dfs(root.right);
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}


class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    	int[] index = {postorder.length - 1};
        return buildTree(inorder, postorder, index, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder, int[] index, int leftBoundary, int rightBoundary) {
    	if (leftBoundary > rightBoundary) return null;
    	TreeNode root = new TreeNode(postorder[index[0]--]);
    	int ind = findIndex(inorder, root.val);
        root.right = buildTree(inorder, postorder, index, ind + 1, rightBoundary);
    	root.left = buildTree(inorder, postorder, index, leftBoundary, ind - 1);
    	
    	return root;
    }

    public int findIndex(int[] inorder, int val) {
    	for (int i = 0; i < inorder.length; i++) {
    		if (val == inorder[i]) return i;
    	}
    	return -1;
    }
}


// [单节点树]
// class Solution {
//     public TreeNode buildTree(int[] preorder, int[] inorder) {
//         List<Integer> list = new ArrayList<Integer>();
//         TreeNode root = null;
//         TreeNode current = null;
//         for (int i : inorder) {
//         	list.add(i);
//         }
//         if (preorder.length == 0) return null;
//         else {
//         	for (int i = 0; i < preorder.length; i++) {
//         		if (i == 0) {
//         			root = new TreeNode(preorder[i]);
//         			current = root;
//         		} else {
//         			if (list.indexOf(preorder[i]) < list.indexOf(preorder[i - 1])) {
//         				current.left = new TreeNode(preorder[i]);
//         				current = current.left;
//         			} else {
//         				current.right = new TreeNode(preorder[i]);
//         				current = current.right;
//         			}
//         		}
//         	}
//         	return root;
//         }
//     }
// }