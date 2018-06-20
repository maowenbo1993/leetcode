public class MaxSubArray{
	public static void main(String[] args){
		Solution s = new Solution();
		int[] arr = {1,3,5,5,6};
		System.out.println(s.maxSubArray(arr));
	
 	}
}

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
       	int max = Integer.MIN_VALUE;
       	for (int i = 0; i < nums.length; i++) {
       		sum = (sum < 0) ? nums[i] : nums[i] + sum;
       		if (sum > max) max = sum;
       	}
       	return max;
    }
}