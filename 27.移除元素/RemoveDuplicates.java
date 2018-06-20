public class RemoveDuplicates{
	public static void main(String[] args){
		Solution s = new Solution();
		int[] arr = {3,2,3,2};
		System.out.println(s.removeElement(arr,3));
	
 	}
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = nums.length;
        for(int i = 0; i < count; i++) {
            if(nums[i] == val) {
                for(int k = i; k < count - 1; k++){
                    nums[k] = nums[k+1];
                }
                count--;
                i--;
            }
        }
        return count;
    }
}