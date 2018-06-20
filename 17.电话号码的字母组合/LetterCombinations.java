import java.util.*;
public class LetterCombinations{
	public static void main(String[] args){
		Solution s = new Solution();
		String ss = "2";
		System.out.print(s.letterCombinations(ss));
 	}
}

class Solution {
	List<String> res = new ArrayList<String>();
    Map<Character, String[]> map = new HashMap<Character, String[]>();
    String str = "";
    public List<String> letterCombinations(String digits) {
    	if (digits == null || digits.length() == 0) return res;
     	map.put('2', new String[]{"a", "b", "c"});
     	map.put('3', new String[]{"d", "e", "f"});
     	map.put('4', new String[]{"g", "h", "i"});
     	map.put('5', new String[]{"j", "k", "l"});
     	map.put('6', new String[]{"m", "n", "o"});
     	map.put('7', new String[]{"p", "q", "r", "s"});
     	map.put('8', new String[]{"t", "u", "v"});
     	map.put('9', new String[]{"w", "x", "y", "z"});
     	dfs(digits,0);
     	return res;
    }
    public void dfs(String digits, int step) {
    	int numLen = digits.length();
    	if (step == digits.length()) {
    		res.add(str);
    		return;
    	}
    	char c = digits.charAt(step);    	
    	String[] strArray = map.get(c);
    	for (String s : strArray) {
    		str += s;
    		dfs(digits, step + 1);
    		str = str.substring(0, str.length() - 1);
    	}
    }
}