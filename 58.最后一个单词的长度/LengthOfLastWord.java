public class LengthOfLastWord{
	public static void main(String[] args){
		Solution s = new Solution();

		System.out.println(s.lengthOfLastWord("hello world"));
	
 	}
}

class Solution {
    public int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        for (int i = strArr.length - 1; i >= 0; i--) {
        	if (strArr[i].length() != 0) return strArr[i].length();
        }
        return 0;
    }
}