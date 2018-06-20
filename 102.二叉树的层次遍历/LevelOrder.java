import java.util.*;

public class LevelOrder {
	public static void main(String[] args) {
		TreeNode p = new TreeNode(10);
        p.left = new TreeNode(5);
        p.right = new TreeNode(5);
        // TreeNode q = new TreeNode(10);
        // TreeNode q1 = new TreeNode(5);
        // q.left = q1;
        // q1.right = new TreeNode(15);
        Solution s = new Solution();
        System.out.print(s.levelOrder(p));
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        if (root == null) return res;
        que.offer(root);
        while (!que.isEmpty()) {
            List<Integer> list = new ArrayList<Integer>();
            int len = que.size();
            for (int i = 0; i < len; i++) {
                if (que.peek().left != null) que.offer(que.peek().left);
                if (que.peek().right != null) que.offer(que.peek().right);
                list.add(que.poll().val);
            }
            res.add(list);
        }
        return res;
    }
}