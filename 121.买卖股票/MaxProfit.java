public class MaxProfit{
	public static void main(String[] args){
		Solution s = new Solution();
		int[] arr = {1,3,5,5,6};
		System.out.println(s.maxProfit(arr));
	
 	}
}
//(Brute Force) [Time Limit Exceeded]
// class Solution {
//     public int maxProfit(int[] prices) {
//     	int max = Integer.MIN_VALUE;
//     	int profit;
//         for (int i = 0; i < prices.length - 1; i++) {
//         	for (int j = i + 1; j < prices.length; j++) {
//         		profit = prices[j] - prices[i];
//         		if (max < profit) max = profit;
//         	}
//         }
//         return (max > 0) ? max : 0;
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
    	int max = 0;
    	int minValleys = Integer.MAX_VALUE;
    	for (int i = 0; i < prices.length; i++) {
    		if (prices[i] < minValleys) minValleys = prices[i];
    		else if (prices[i] - minValleys > max ) max = prices[i] - minValleys;
    	}
    	return max;
    }
}