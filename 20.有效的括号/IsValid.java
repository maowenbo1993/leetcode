import java.util.*;

public class IsValid{
	public static void main(String[] args){
		Solution s = new Solution();
		
		System.out.println(s.isValid("([{])"));
 	}
}
class Solution {
    public boolean isValid(String str) {
    	Stack<Character> s = new Stack<Character>();
        char[] charArr = str.toCharArray();
        for (char c : charArr) {
        	switch(c) {
        		case '(':
        			s.push(')');
        			break;
        		case '[':
        			s.push(']');
        			break;
        		case '{':
        			s.push('}');
        			break;
        		default:
        			if (s.isEmpty() || s.pop() != c) return false;
        	}
        }
        if (s.isEmpty()) return true;
        else return false;
    }
}