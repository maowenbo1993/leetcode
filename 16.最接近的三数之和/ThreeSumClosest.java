import java.util.*;

public class ThreeSumClosest{
	public static void main(String[] args){
		
 	}
}

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int lo = i + 1;
            int hi = nums.length - 1;
            int sum = target - nums[i];
            while (lo < hi) {
                int dis = sum - nums[lo] - nums[hi];
                if (Math.abs(dis) < min) {
                    min = Math.abs(dis);
                    res = nums[i] + nums[lo] + nums[hi];
                }
                if (dis > 0) {
                    lo++;
                } else if (dis < 0) {
                    hi--;
                } else {
                    return res;
                }
            }
        } 
        return res;
    }
}