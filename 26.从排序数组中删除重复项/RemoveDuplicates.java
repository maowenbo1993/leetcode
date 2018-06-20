public class RemoveDuplicates{
	public static void main(String[] args){
		Solution s = new Solution();
		int[] arr = {3,2,3,2};
		System.out.println(s.removeDuplicates(arr));
	
 	}
}

class Solution {
    public int removeDuplicates(int[] nums) {
    	int count = nums.length;
        for(int i = 0; i < count; i++) {
        	for(int j = i + 1; j <count; j++) {
        		if(nums[i] == nums[j]) {
        			for(int k = i; k < count - 1; k++){
        				nums[k] = nums[k+1];
        			}
        			count--;
        			i--;
        			break;
        		}
        	}
        }
        return count;
    }
}