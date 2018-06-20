public class PlusOne{
	public static void main(String[] args){
		Solution s = new Solution();
		int[] arr = {9,9,8};
		int[] a = s.plusOne(arr);
		System.out.println("" + a[0] + a[1] + a[2] );
	
 	}
}

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
        	if (digits[i] == 9) {
        		digits[i] = 0;
        	} else {
        		digits[i]++;
        		return digits;
        	}
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}

// class Solution {
//     public int[] plusOne(int[] digits) {
//     	int sum = 0;
//     	for (int i = 0; i < digits.length; i++) {
//     		sum += digits[i] * (int)Math.pow(10, digits.length - 1 - i);
//     	}
//     	sum += 1;
//     	if (sum / (int)Math.pow(10, digits.length) == 0) {
//     		int count = 1;
//     		while (sum != 0) {
//     			digits[digits.length - count] = sum % 10;
//     			sum /= 10;
//     			count++;
//     		}
//     		return digits;
//     	} else {
//     		int[] array = new int[digits.length + 1];
//     		int count = 1;
//     		while (sum != 0) {
//     			array[array.length - count] = sum % 10;
//     			sum /= 10;
//     			count++;
//     		}
//     		return array;
//     	}
//     }
// }