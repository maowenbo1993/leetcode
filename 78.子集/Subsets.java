import java.util.*;
public class Subsets {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1,2,3};
		System.out.print(s.subsets(nums));
	}
}
class Solution {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	List<Integer> tempList = new ArrayList<Integer>();
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        res.add(new ArrayList<Integer>());
        dfs(nums, 0);
        return res;
    }
    public void dfs(int[] nums, int start) {
    	if (start == nums.length) return;
    	for (int i = start; i < nums.length; i++) {
    		tempList.add(nums[i]);
    		res.add(new ArrayList<Integer>(tempList));
    		dfs(nums, i + 1);
    		tempList.remove(tempList.size() - 1);
    	}
    }
}
