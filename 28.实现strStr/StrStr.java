public class StrStr{
	public static void main(String[] args){
		Solution s = new Solution();
		System.out.println(s.strStr("sjdabc", "abc"));
	
 	}
}

class Solution {
    public int strStr(String haystack, String needle) {
    	if (needle.length() == 0) return 0;
    	int m = needle.length();
    	int n = haystack.length();
        for (int i = 0; i <= n - m; i++) {
        	for (int j = 0; j < m; j++) {
        		if (haystack.charAt(i) != needle.charAt(j)) {   //haystack.charAt(i) -> haystack.charAt(i + j)
        			i = i - j;
        			break;
        		}
        		if (j == needle.length() - 1) return i - j;
        		i++;
        	}
        }
        return -1;
    }
}