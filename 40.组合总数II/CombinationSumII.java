import java.util.*;
public class CombinationSumII {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1,1,2,5,6,7,10};
		System.out.print(s.combinationSum2(nums, 8));
	}
}
class Solution {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	List<Integer> tempList = new ArrayList<Integer>();
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
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
            if (i > step && nums[i] == nums[i - 1]) continue; 
    		tempList.add(nums[i]);		
    		dfs(nums, remain - nums[i], i + 1);
    		tempList.remove(tempList.size() - 1);                    
    	}
    }
}
