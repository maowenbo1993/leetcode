import java.util.*;

public class SingleNumberII {
	public static void main(String[] args){
		Solution s = new Solution();
		int[] nums = {2,2,3,3,1,4,5,4,5};
		int target = 26;
		// int[] ans = s.twoSum(nums,target);
		System.out.println(s.singleNumber(nums));
 	}
}

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
        	if (!m.containsKey(nums[i])) {
        		m.put(nums[i], 1);
        	} else {
        		m.put(nums[i], m.get(nums[i]) + 1);
        	}
            if (m.get(nums[i]) == 3) m.remove(nums[i]);
        }
        for (int n : nums) {
        	if (m.containsKey(n)) return n;
        }
        return -1;
    }
}