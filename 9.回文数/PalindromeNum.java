public class PalindromeNum{
	public static void main(String[] args){
		Solution s = new Solution();
		
		System.out.println(s.isPalindrome(2222222222));
 	}
}

class Solution {
    public boolean isPalindrome(int x) {
    	if(x < 0){
    		return false;
    	}
        int result = 0;
        int tep = x;
        while(x != 0){
    		int tail = x % 10;
    		int newResult = result * 10 + tail;
    		x /= 10;
    		result = newResult;
        }
        if(result == tep){
        	return true;
        }else{
        	return false;
        }
    }
}