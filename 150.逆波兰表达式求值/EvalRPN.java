import java.util.*;

public class EvalRPN{
	public static void main(String[] args){
		Solution s = new Solution();
 	}
}
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        Set<String> set = new HashSet<String>(Arrays.asList("+", "-", "*", "/"));
        for (String s : tokens) {
	        if (set.contains(s)) {
	        	int num2 = Integer.parseInt(stack.pop());
	        	int num1 = Integer.parseInt(stack.pop());
	        	switch (s) {
	        		case "+":
	        			stack.push(Integer.toString(num1 + num2));
	        			break;
	        		case "-":
	        			stack.push(Integer.toString(num1 - num2));
	        			break;
	        		case "*":
	        			stack.push(Integer.toString(num1 * num2));
	        			break;
	        		case "/":
	        			stack.push(Integer.toString(num1 / num2));
	        			break;
	        	}
	        } else {
	        	stack.push(s);
	        }
        }
        return Integer.parseInt(stack.pop());
    }
}