public class Convert {
	public static void main(String[] args) {
		String ss = "PAYPALISHIRING";
		Solution s = new Solution();
		System.out.print(s.convert(ss,3));
	}
}
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int circle = numRows * 2 -2;
        String res = "";
        for (int j = 0; j < numRows; j++) {
            for (int i = 0; i < s.length(); i++) {
            	if (i % circle == j || i % circle == circle - j) res += s.charAt(i);
        	}
        }
        return res;
    }
}




// PAHNAPLSIIGYIR