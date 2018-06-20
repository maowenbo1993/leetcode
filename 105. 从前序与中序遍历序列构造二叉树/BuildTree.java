import java.util.*;
public class BuildTree {
	public static void main(String[] args) {
		int[] preorder = {3, 9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		Solution s = new Solution();

		dfs(s.buildTree(preorder, inorder));
	}
	public static void dfs(TreeNode root) {
		if (root == null) return;
		System.out.println(root.val);
		dfs(root.left);
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	int[] index = {0};
        return buildTree(preorder, inorder, index, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int[] index, int leftBoundary, int rightBoundary) {
    	if (leftBoundary > rightBoundary) return null;
    	TreeNode root = new TreeNode(preorder[index[0]++]);
    	int ind = findIndex(inorder, root.val);
    	root.left = buildTree(preorder, inorder, index, leftBoundary, ind - 1);  //如果inoder[]中当前节点（root）的索引左边还存在其他节点则pre[]中的下个节点一定为root的左节点
    	root.right = buildTree(preorder, inorder, index, ind + 1, rightBoundary); //否则，如果索引不超过右边界，则一定为root的右节点
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