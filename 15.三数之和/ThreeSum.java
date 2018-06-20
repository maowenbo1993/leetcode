import java.util.*;

public class ThreeSum{
	public static void main(String[] args){
		
 	}
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length - 2; i++) {
            int lo = i + 1;
            int hi = nums.length - 1;
            int sum = 0 - nums[i];
            if (i == 0 || nums[i] != nums[i - 1]) {
            	while (lo < hi) {
            		if (nums[lo] + nums[hi] < sum) {
            			lo++;
            		} else if (nums[lo] + nums[hi] > sum) {
            			hi--;
            		} else {
            			List<Integer> li = new ArrayList<Integer>();
            			li.add(nums[i]);
            			li.add(nums[lo]);
            			li.add(nums[hi]);
            			res.add(li);
            			while (lo < hi && nums[lo] == nums[lo + 1]) {
            				lo++;
            			}
            			while (lo < hi && nums[hi] == nums[hi - 1]) {
            				hi--;
            			}
            			lo++;
            			hi--;
            		}
            	}
            }
        } 
        return res;
    }
}
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//     	Arrays.sort(nums);
//     	List<List<Integer>> result = new ArrayList<List<Integer>>();
//         Map<Integer, Integer> m = new HashMap<Integer, Integer>();
//         for (int i = 0; i < nums.length; i++) {
//         	m.put(nums[i], i);
//         }
//         for (int i = 0; i < nums.length; i++) {
//         	if (i > 0 && nums[i] == nums[i - 1]) continue;
//         	for (int j = i + 1; j < nums.length - 1; j++) {
//         		if (nums[j] == nums[j - 1] && nums[i] != nums[j]) continue;
//         		int target = 0 - nums[i] - nums[j];
//         		if (m.containsKey(target) && m.get(target) > i && m.get(target) > j) {
//         			List<Integer> l = new ArrayList<Integer>();
//         			l.add(nums[i]);
//         			l.add(nums[j]);
//         			l.add(target);
//         			result.add(l);
//         			if (nums[j + 1] == nums[j]) i++;
//         			continue;
//         		}
//         	}
//         }
//         return result;
//     }
// }