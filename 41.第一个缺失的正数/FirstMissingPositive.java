import java.util.*;

public class FirstMissingPositive{
	public static void main(String[] args){
		
 	}
}
class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
        	s.add(nums[i]);
        	if (nums[i] > 0 && nums[i] < min) min = nums[i];
        }
        if (min > 1) return 1;
        while (s.contains(min)) {
        	min++;
        }
        return min;
    }
}