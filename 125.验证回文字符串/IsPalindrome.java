public class IsPalindrome{
	public static void main(String[] args){
		Solution s = new Solution();

		System.out.println(s.isPalindrome("Aaa"));
	
 	}
}
class Solution {
    public Boolean isPalindrome(String s) {
        int lo = 0;
        int hi = s.length() - 1;
        while (lo < hi) {
        	while (!Character.isLetterOrDigit(s.charAt(lo)) && lo < hi) {
        		lo++;
        	}
        	while (!Character.isLetterOrDigit(s.charAt(hi)) && lo < hi) {
        		hi--;
        	}
        	if (Character.toLowerCase(s.charAt(lo)) != Character.toLowerCase(s.charAt(hi))) return false;
        	lo++;
        	hi--;
        }
        return true;
    }
}