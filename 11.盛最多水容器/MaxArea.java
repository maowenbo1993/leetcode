public class MaxArea{
	public static void main(String[] args){
		
 	}
}

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length - 1;
        while (start != end) {
        	int area = (end - start) * Math.min(height[start], height[end]);
        	if (area > max) max = area;
        	if (height[start] > height[end]) end--;
        	else start++;
        }
        return max;
    }
}
// [Time Limit Exceeded]
// class Solution {
//     public int maxArea(int[] height) {
//         int max = 0;
//         int l = 0;
//         for (int i = 0; i < height.length; i++) {
//         	for (int j = i + 1; j < height.length; j++) {
//         		int area = (j - i) * Math.min(height[i], height[j]);
//         		if ( area > max) max = area;
//         	}
//         }
//         return max;
//     }
// }