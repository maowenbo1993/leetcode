public class SearchRange{
	public static void main(String[] args){
		// Solution s = new Solution();
		// int[] nums = {1};
		// System.out.print(s.BinarySearch(nums, 1));
		// int[] res = s.searchRange(nums, 1);
		// System.out.print(""+res[0]+res[1]);
 	}
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        
    }
    public int SearchBig(int[], int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (target >= nums[mid]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
    public int searchSmall(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (target <= nums[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}


//[O(N)]
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//     	int mid = BinarySearch(nums, target);
//     	int lo = 0;
//     	int hi = nums.length - 1;
//         if (mid == -1) return new int[]{-1, -1};
//         int lo1 = mid;
//         int hi1 = mid;
//         while (lo <= lo1) {
//         	if (nums[lo1] == target) lo1--;
//         	else break;
//         }
//         while (hi >= hi1) {
//         	if (nums[hi1] == target) hi1++;
//         	else break;
//         }
//         return new int[]{lo1 + 1, hi1 - 1};

//     }

//     public int BinarySearch(int[] nums, int target) {
//     	int lo = 0;
//         int hi = nums.length - 1;
//         while (lo <= hi) {
//         	int mid = (lo + hi) / 2;
//         	if (target == nums[mid]) return mid;
//         	else if (target < nums[mid]) hi = mid - 1;
//         	else lo = mid + 1; 
//         }
//         return -1;
//     }
// }