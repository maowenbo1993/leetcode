public class NumDecodings{
	public static void main(String[] args){
		Solution s = new Solution();

		System.out.println(s.numDecodings("1212"));
	
 	}
}

//[DP]
class Solution {
    public int numDecodings(String s) {
        char[] charArr = s.toCharArray();
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {           
            if (i == 0) {
                if (charArr[i] != '0') res[i] = 1;
                else res[i] = 0;
            } else if (i == 1) {
                if (res[i - 1] == 0) res[i] = 0;
                else if (charArr[i] == '0') {
                    if (charArr[i - 1] - '0' > 2) res[i] = 0;
                    else res[i] = 1;
                } else {
                    if ((charArr[i - 1] - '0' == 2 && charArr[i] - '0' <= 6) || charArr[i - 1] - '0' == 1) res[i] = 2;
                    else res[i] = 1;
                }
            }
            else {
                if (res[i - 1] == 0) res[i] = 0;
                else if (charArr[i] == '0') {
                    if (charArr[i - 1] == '0') res[i] = 0;
                    else if (charArr[i - 1] - '0' > 2) res[i] = 0;
                    else res[i] = res[i - 2];
                }
                else {
                    if (charArr[i - 1] == '0') res[i] = res[i - 1];
                    else if ((charArr[i - 1] - '0' == 2 && charArr[i] - '0' <= 6) || charArr[i - 1] - '0' == 1) res[i] = res[i - 1] + res[i - 2];
                    else res[i] = res[i - 1];
                }
            }
        }
        return res[s.length() - 1];
    }
}


// class Solution {
//     public int numDecodings(String s) {
//     	if (s == null || s.length() == 0) return 0;
//     	if (s.length() == 1) {
//     		if (s.charAt(0) != '0') return 1;
//     		else return 0;
//     	}
//     	if (s.charAt(s.length() - 1) == '0' && s.charAt(s.length() - 2) == '0') return 0; 
//     	String[] strArr = s.split("0");
//     	if (strArr.length == 0) return 0;
//     	if (strArr.length != 1) {
// 	    	for (int i = strArr.length - 1; i >= 0; i--) {
// 	    		if (strArr[i].length() == 0) return 0;
// 	    	}
//     	}
//         int res = 1;
//         for (int i = 0; i < s.length() - 1; i++) {
//         	if (s.charAt(i) == '1' && s.charAt(i + 1) != '0') res++;
//         	if (s.charAt(i) == '2' && s.charAt(i + 1) != '0' && s.charAt(i + 1) - '0' <= 6) res++;
//         }
//         return res;
//     }
// }