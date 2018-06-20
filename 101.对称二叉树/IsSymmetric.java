import java.util.*;

public class IsSymmetric {
	public static void main(String[] args) {
		TreeNode p = new TreeNode(10);
        p.left = new TreeNode(5);
        p.right = new TreeNode(5);
        // TreeNode q = new TreeNode(10);
        // TreeNode q1 = new TreeNode(5);
        // q.left = q1;
        // q1.right = new TreeNode(15);
        Solution s = new Solution();
        System.out.print(s.isSymmetric(p));
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
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root, root);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return isSame;
        else if (p == null || q == null || p.val != q.val) {
            isSame = false;
            return isSame;
        }
        isSameTree(p.left, q.right);
        isSameTree(p.right, q.left);
        return isSame; 
    } 
}
// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         List<Integer> list = new ArrayList<Integer>();
//         list = symmetric(root, list);
//         int[] arr = new int[list.size()];
//         for (int i = 0; i < list.size(); i++) {
//             arr[i] = list.get(i);
//         }
//         Collections.reverse(list);
//         int[] revArr = new int[list.size()];
//         for (int i = 0; i < list.size(); i++) {
//             revArr[i] = list.get(i);
//         }
//         for (int i = 0; i < list.size(); i++) {
//             if (revArr[i] != arr[i]) return false;
//         }
//         return true;
//     }
//     public List<Integer> symmetric(TreeNode root, List<Integer> list) {
//         if (root == null) return list;
//         isSymmetric(root.left);
//         list.add(root.val);
//         isSymmetric(root.right);
//         return list;
//     }
// }