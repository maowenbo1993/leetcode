import java.util.*;
public class RecoverTree {
	public static void main(String[] args) {
		TreeNode p = new TreeNode(2);
        p.left = new TreeNode(3);
        p.right = new TreeNode(1);
        // TreeNode q = new TreeNode(10);
        // TreeNode q1 = new TreeNode(5);
        // q.left = q1;
        // q1.right = new TreeNode(15);
        Solution s = new Solution();
        s.recoverTree(p);
        // System.out.print(s.isSymmetric(p));
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
    TreeNode small = null;
    TreeNode next = null;
    TreeNode big = null;
    TreeNode cur = null;
    long value = Long.MIN_VALUE;
    List<TreeNode> map = new ArrayList<TreeNode>();
    public void recoverTree(TreeNode root) {
        
        map = recover(root);
        if (map.size() == 3) {
            int temp = map.get(2).val;
            map.get(2).val = map.get(0).val;
            map.get(0).val = temp;  
        } 
        else if (map.size() == 2) {
            int temp = map.get(1).val;
            map.get(1).val = map.get(0).val;
            map.get(0).val = temp;  
        }
        System.out.println(map.size());
        for (TreeNode t : map) {
             System.out.println(t.val);
        }
    }
    public List<TreeNode> recover(TreeNode root) {
        if (root == null) return map;
        recover(root.left);
        if (root.val <= value) {
            if (small == null) {
                small = cur;
                map.add(small);
                next = root;
                map.add(next);
            }
            else {
                big = root;
                map.add(big);
            }
        }
        cur = root;
        value = root.val;
        recover(root.right); 
        return map;
    }
}