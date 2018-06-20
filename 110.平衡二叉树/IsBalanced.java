import java.util.*;

class IsBalanced {
	public static void main(String[] args) {
		
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

//[dfs]
class Solution {
	boolean isBalance = true;
    public boolean isBalanced(TreeNode root) {
 		dfs(root);
 		return isBalance;
    }

    public int dfs(TreeNode root) {
    	if (root == null) return 0;
    	int a = dfs(root.left);
    	int b = dfs(root.right);
    	if (Math.abs(a - b) > 1) isBalance = false;
    	return (a > b) ? a + 1 : b + 1;
    }
}

// [bfs]
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if (root == null) return true;
//         Queue<TreeNode> queue = new LinkedList<TreeNode>();
//         queue.add(root);
//         int flag = 0;
//         while (!queue.isEmpty()) {
//         	int len = queue.size();
//         	for (int i = 0; i < len; i++) {
//         		if (flag == 1 && (queue.peek().left != null || queue.peek().right != null)) return false;
//         		if (queue.peek().left != null) queue.add(queue.peek().left);
//         		if (queue.peek().right != null) queue.add(queue.peek().right);
//         		queue.remove();
//         	}
//         	if (queue.size() != 2 * len) {
//         		flag = 1; 
//         	}
//         }
//         return true;
//     }
// }
