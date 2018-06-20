import java.util.*;

public class SimplifyPath{
	public static void main(String[] args){
		// Solution s = new Solution();
		// String str = "/a/b/c/";
		// Stack<String> ss = s.simplifyPath(str);
		// for (String ssss : ss) {
		// 	System.out.println(ssss);
		// }
		// System.out.println(ss);
 	}
}

class Solution {
    public String simplifyPath(String path) {
        Stack<String> sta = new Stack<String>();
        String[] strArr = path.split("/");
        String res = "";
        for (String str : strArr) {
        	if (str.equals("") || str.equals(".")) continue;
        	else if (str.equals("..")) {
        		if (!sta.isEmpty()) sta.pop();
        	} else {
        		sta.push(str);
        	}
        }
   
        Stack<String> sta2 = new Stack<String>();
        while (!sta.isEmpty()) {
        	sta2.push(sta.pop());
        }
        while (!sta2.isEmpty()) {
        	res += "/";
        	res += sta2.pop();
        }
        if (res.equals("")) return "/";
        else return res;
    }
}