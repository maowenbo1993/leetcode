import java.util.*;

class MinDepth {
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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);   
        int deep = 0;     
        while (!queue.isEmpty()) {
        	deep++;
        	int len = queue.size();
        	for (int i = 0; i < len; i++) {
        		if (queue.peek().left == null && queue.peek().right == null) return deep;
        		if (queue.peek().left != null) queue.add(queue.peek().left);
        		if (queue.peek().right != null) queue.add(queue.peek().right);
        		queue.remove();
        	}
        }
        return deep;
    }
}
