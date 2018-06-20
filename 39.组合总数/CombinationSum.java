import java.util.*;
public class CombinationSum {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {2,6,3,7};
		System.out.print(s.combinationSum(nums, 7));
	}
}
class Solution {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	List<Integer> tempList = new ArrayList<Integer>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        dfs(nums, target, 0);
        return res;
    }
    public void dfs(int[] nums, int remain, int step) {
    	if (remain < 0) return;
        else if (remain == 0) {
            res.add(new ArrayList<Integer>(tempList));
            return;
        }
    	for (int i = step; i < nums.length; i++) {
    		tempList.add(nums[i]);		
    		dfs(nums, remain - nums[i], i);
    		tempList.remove(tempList.size() - 1);           
    	}
    }
}
