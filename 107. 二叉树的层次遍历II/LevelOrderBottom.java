import java.util.*;

class LevelOrderBottom {
	public static void main(String[] args) {
		
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}


// [bfs]
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);        
        while (!queue.isEmpty()) {
        	int len = queue.size();
            List<Integer> list = new ArrayList<Integer>();
        	for (int i = 0; i < len; i++) {
        		if (queue.peek().left != null) queue.add(queue.peek().left);
        		if (queue.peek().right != null) queue.add(queue.peek().right);
        		list.add(queue.remove().val);
        	}
            res.add(0,list);
        }
        return res;
    }
}
