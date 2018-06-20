import java.util.*;

public class TwoSumII {
	public static void main(String[] args){
		Solution s = new Solution();
		int[] nums = {2,7,11,15};
		int target = 26;
		int[] ans = s.twoSum(nums,target);
		System.out.println(""+ans[0]+ans[1]);
 	}
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//         	for(int j=0;j<nums.length;j++){
//         		if(i!=j){
//         			if(nums[i]+nums[j]==target){
//         				int[] ii = {i+1,j+1};
//         				return ii;
//         			}
//         		}
//         	}
//         }
//         return null;
//     }
// }

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();   
            for (int i = 0; i < numbers.length; i++) {
                m.put(numbers[i], i);
            }
            for (int i = 0; i < numbers.length; i++) {
                int key = target - numbers[i];
                if (m.containsKey(key) && m.get(key) != i) {
                    return new int[] {i + 1, m.get(key) + 1};
                }
            }
            return null;
    }
}