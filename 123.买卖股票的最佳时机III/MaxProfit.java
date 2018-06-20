public class MaxProfit {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] sample = {1,2,4};
		System.out.println(s.maxProfit(sample)); 
	}
}

//[DP]
class Solution {
    public int maxProfit(int[] prices) {
    	if (prices.length == 0) return 0;
		int[] hold1 = new int[prices.length];
		int[] release1 = new int[prices.length];
		int hold2[] = new int[prices.length];
		int release2[] = new int[prices.length];   

		for (int i = 0; i < prices.length; i++) {
			if (i == 0) {
				hold1[i] = -prices[i];
				release1[i] = 0;
				hold2[i] = -prices[i];
				release2[i] = 0;
			} else {
				hold1[i] = Math.max(hold1[i - 1], -prices[i]);
				release1[i] = Math.max(release1[i - 1], hold1[i] + prices[i]);
				hold2[i] = Math.max(hold2[i - 1], release1[i] - prices[i]);
				release2[i] = Math.max(release2[i - 1], hold2[i] + prices[i]);
			}
		} 

		return release2[prices.length - 1];
    }
}


//[O(n^2)]
// class Solution {
// 	int minValue = Integer.MAX_VALUE;
// 	int maxPro = 0;
// 	int max = 0;
//     public int maxProfit(int[] prices) {
//     	if (prices.length < 4) {
//     		return single(prices);
//     	} else {
// 	        for (int i = 1; i < prices.length - 2; i++) {
// 	        	int[] arr1 = new int[i + 1];
// 	        	for (int m = 0; m <= i; m++) {
// 	        		arr1[m] = prices[m];
// 	        	}
// 	        	// toStr(arr1);
// 	        	int profit1 = single(arr1);
// 	        	// System.out.println(profit1);

// 	        	int[] arr2 = new int[prices.length - i];
// 	        	for (int n = 0; n < prices.length - i; n++) {
// 	        		arr2[n] = prices[n + i];
// 	        	}
// 	        	// toStr(arr2);
// 	        	int profit2 = single(arr2);
// 	        	// System.out.println(profit2);

// 	        	if (profit1 + profit2 > max) max = profit1 + profit2;
// 	        }
// 	        return max;
// 	    }
//     }

//     public int single (int[] prices) {
//     	minValue = Integer.MAX_VALUE;
//     	maxPro = 0;
//     	for (int i = 0; i < prices.length; i++) {
//     		if (prices[i] < minValue) minValue = prices[i];
//     		else {
//     			if (prices[i] - minValue > maxPro) {
//     				maxPro = prices[i] - minValue;
//     			}
//     		}
//     	}
//     	return maxPro;
//     }

//     // public void toStr(int[] arr) {
//     // 	for (int i = 0; i < arr.length; i++) {
//     // 		System.out.print(arr[i] + " ");	
//     // 	}
//     // 	System.out.println();
//     // }
// }