import java.util.*;
public class Permute {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1,2,3};
		System.out.print(s.permute(nums));
	}
}
class Solution {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	List<Integer> tempList = new ArrayList<Integer>();
    public List<List<Integer>> permute(int[] nums) {
        dfs(nums);
        return res;
    }
    public void dfs(int[] nums) {
    	if (tempList.size() == nums.length) {
            res.add(new ArrayList<Integer>(tempList));
            return;
        }
    	for (int i = 0; i < nums.length; i++) {
            if (!tempList.contains(nums[i])) {
        		tempList.add(nums[i]);		
        		dfs(nums);
        		tempList.remove(tempList.size() - 1);
            }
    	}
    }
}
