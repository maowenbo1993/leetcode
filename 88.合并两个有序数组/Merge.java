public class Merge{
	public static void main(String[] args){
		Solution s = new Solution();
		int[] nums1 = {4,5,6,0,0,0};
		int[] nums2 = {1,2,3};
		int[] nums = s.merge(nums1,3,nums2,3);
		for (int i = 0; i < 6; i++){
			System.out.print(nums[i]);
		}
		System.out.println("");
	
 	}
}  

class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int index = m + n - 1;   
        while (n != 0 && m != 0) {
        	if (nums1[m - 1] > nums2[n - 1]) {
        		nums1[index] = nums1[m - 1];
        		index--;
        		m--;
        	} else {
        		nums1[index] = nums2[n - 1];
        		index--;
        		n--;
        	}
        }
        while (n != 0) {
        	nums1[index] = nums2[n - 1];
        	index--;
        	n--;
        }
        return nums1;
    }
}