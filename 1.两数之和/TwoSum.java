public class TwoSum{
	public static void main(String[] args){
		Solution s = new Solution();
		int[] nums = {2,7,11,15};
		int target = 26;
		int[] ans = s.twoSum(nums,target);
		System.out.println(""+ans[0]+ans[1]);
 	}
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
        	for(int j=0;j<nums.length;j++){
        		if(i!=j){
        			if(nums[i]+nums[j]==target){
        				int[] ii = {i,j};
        				return ii;
        			}
        		}
        	}
        }
        return null;
    }
}