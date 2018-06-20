public class MaxProfitII{
	public static void main(String[] args){
		Solution s = new Solution();
		int[] arr = {1,3,1,5,6};
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
        int profit = 0;
    	for (int i = 1; i < prices.length; i++) {
    		if (prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1];
    	}
    	return profit;
    }
}