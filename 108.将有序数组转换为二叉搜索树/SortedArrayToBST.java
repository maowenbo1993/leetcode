class SortedArrayToBST {
	public static void main(String[] args) {
		
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    public TreeNode dfs(int[] nums, int lo, int hi) {
    	if (lo > hi) return null;
    	int mediem = (lo + hi) / 2;
    	TreeNode root = new TreeNode(nums[mediem]);
    	root.left = dfs(nums, lo, mediem - 1);
    	root.right = dfs(nums, mediem + 1, hi);
    	return root;
    }
}