public class SortColors{
	public static void main(String[] args){
		Solution s = new Solution();
		int nums[] = {1,0};
		s.sortColors(nums);
		for (int ss : nums) {
			System.out.print(ss);
		}
 	}
}
class Solution {
    public void sortColors(int[] nums) {
        int i0 = 0;
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] == 0) i0++;
        	else if (nums[i] == 1) i1++;
        	else i2++;
        }
        for (int i = 0; i < nums.length; i++) {
        	if (i < i0) nums[i] = 0;
        	else if (i < i1 + i0) nums[i] = 1;
        	else nums[i] = 2;
        }
    }
}