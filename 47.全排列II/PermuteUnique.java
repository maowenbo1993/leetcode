import java.util.*;
public class PermuteUnique {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1,1,2};
		System.out.print(s.permuteUnique(nums));
	}
}
class Solution {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	List<Integer> tempList = new ArrayList<Integer>();   
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums, 0, used);
        return res;
    }
    public void dfs(int[] nums, int step, boolean[] used) {
    	if (step == nums.length) {
            res.add(new ArrayList<Integer>(tempList));
            return;
        }
    	for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue; 
            if (!used[i]) {
                used[i] = true;
        		tempList.add(nums[i]);		
        		dfs(nums, step + 1, used);
                used[i] = false;
        		tempList.remove(tempList.size() - 1);
            }
    	}
    }
}
