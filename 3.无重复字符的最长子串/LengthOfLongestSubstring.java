public class LengthOfLongestSubstring {
	public static void main(String[] args) {
		Solution s = new Solution();
		String ss = "abcabcbbbbbbb";
		System.out.print(s.lengthOfLongestSubstring(ss));
	}
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        String str = "";
        int maxLen = 0;
        for (char cc : c) {
        	String ss = String.valueOf(cc);
        	if (str.contains(ss)) {
        		if (str.indexOf(ss) == str.length() - 1) str = "";
        		else str = str.substring(str.indexOf(ss) + 1);
        	}
        	str += ss;
        	maxLen = Math.max(maxLen, str.length());
        }
        return maxLen;
    }
}