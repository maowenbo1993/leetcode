public class Rotate {
	public static void main(String[] args){
		Solution s = new Solution();
		int[] nums = {1,2,3,4,5,6,7};
		s.rotate(nums, 3);
		// int[] ans = s.twoSum(nums,target);
		for (int n : nums) {
			System.out.println(n);
		}
		
 	}
}

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
    	while (start < end) {
    		int tep = nums[start];
    		nums[start] = nums[end];
    		nums[end] = tep;
    		start++;
    		end--;
    	}
    }
}

// [Time Limit Exceeded]
// class Solution {
//     public void rotate(int[] nums, int k) {
//     	if (nums == null) System.out.println("数组为空");
//     	else {
//     		while (k > 0) {
//     			int tep = nums[nums.length - 1];
// 	        	for (int i = nums.length - 1; i > 0; i--) {
// 	        		nums[i] = nums[i - 1];
// 	        	}
// 	        	nums[0] = tep;
// 	        	k--;
//     		}
// 	    }
//     }
// }