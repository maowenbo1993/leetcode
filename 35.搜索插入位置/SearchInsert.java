public class SearchInsert{
	public static void main(String[] args){
		Solution s = new Solution();
		int[] arr = {1,3,5,6};
		System.out.println(s.searchInsert(arr,0));
	
 	}
}

//[Binary Search]
class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }
}

// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         if (target < nums[0]) return 0;
//         for (int j = 0; j < nums.length - 1; j++) {
//             if (nums[j] == target) {
//                 return j;
//             } else if (target > nums[j] && target < nums[j + 1]) {
//                 return j + 1;
//             } 
//         }
//         return (target == nums[nums.length - 1]) ? nums.length -1 : nums.length;
//     }
// }
