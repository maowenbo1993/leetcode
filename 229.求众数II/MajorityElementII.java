import java.util.*;

public class MajorityElementII {
	public static void main(String[] args){
		Solution s = new Solution();
		int[] nums = {2,2,3,3,3,2,2};
		int target = 26;
		// int[] ans = s.twoSum(nums,target);
		System.out.println(s.majorityElement(nums));
 	}
}

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<Integer>();
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
        	if (!m.containsKey(nums[i])) {
        		m.put(nums[i], 1);
        	} else {
        		m.put(nums[i], m.get(nums[i]) + 1);
        	}
        	// System.out.println(m.get(nums[i]));
        	// if (m != null) System.out.println("wow");
        	if (m.get(nums[i]) > nums.length / 3 && !l.contains(nums[i])) {
        		l.add(nums[i]);
        	}
        }
        return l;
    }
}