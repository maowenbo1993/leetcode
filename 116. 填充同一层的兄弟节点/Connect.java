import java.util.*;

class Connect {
	public static void main(String[] args) {
		
	}
}

class TreeLinkNode {
	int val;
	TreeLinkNode left;
	TreeLinkNode right;
	TreeLinkNode next;
	TreeLinkNode(int x) { val = x; }
}


// [bfs]
class Solution {
   public void connect(TreeLinkNode root) {
        if (root == null) return;
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.add(root);        
        while (!queue.isEmpty()) {
        	int len = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            TreeLinkNode cur = null;
        	for (int i = 0; i < len; i++) {
        		if (cur == null) cur = queue.peek();
        		else {
        			cur.next = queue.peek();
        			cur = cur.next;
        		}
        		if (queue.peek().left != null) queue.add(queue.peek().left);
        		if (queue.peek().right != null) queue.add(queue.peek().right);
        		queue.remove();
        	}
        }
    }
}
