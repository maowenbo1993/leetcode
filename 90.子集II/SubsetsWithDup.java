import java.util.*;
public class SubsetsWithDup {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1,2,2};
		System.out.print(s.subsetsWithDup(nums));
	}
}
class Solution {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	List<Integer> tempList = new ArrayList<Integer>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        res.add(new ArrayList<Integer>());
        dfs(nums, 0);
        return res;
    }
    public void dfs(int[] nums, int step) {
    	if (step == nums.length) return;
    	for (int i = step; i < nums.length; i++) {
    		if (i > step && nums[i] == nums[i - 1]) continue;
    		tempList.add(nums[i]);
    		res.add(new ArrayList<Integer>(tempList));
    		dfs(nums, i + 1);
    		tempList.remove(tempList.size() - 1);
    	}
    }
}
