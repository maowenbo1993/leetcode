public class CanJump{
	public static void main(String[] args){
		Solution s = new Solution();
		int nums[] = {2,3,1,1,4};
		System.out.print(s.canJump(nums));
 	}
}
class Solution {
    public boolean canJump(int[] nums) {
    	int step = 0;
        for (int i = 0; i < nums.length - 1; i++) {
        	if (step >= nums.length - 1) return true;
        	step = Math.max(step, i + nums[i]);
        	if (nums[i] == 0) {
        		if (step > i) continue;
        		else return false;
        	}
        }
        return true;
    }
}

// [concise]
// public boolean canJump(int[] nums) {
//     int reachable = 0;
//     for (int i=0; i<nums.length; ++i) {
//         if (i > reachable) return false;  //key code！！
//         reachable = Math.max(reachable, i + nums[i]);
//     }
//     return true;
// }