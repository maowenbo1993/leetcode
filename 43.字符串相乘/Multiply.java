public class Multiply{
	public static void main(String[] args){
		Solution s = new Solution();

		System.out.println(s.multiply("123", "456"));
	
 	}
}
class Solution {
    public String multiply(String num1, String num2) {
    	if (num1.length() == 0 || num2.length() == 0) return null;
    	String temp;
    	String res = "";
    	int count = 0;
    	String zero = "";
        if (num1.length() >= num2.length()) {
        	while (num2.length() != 0) {      		
        		for (int i = 0; i < count; i++) {
        			zero += 0;
        		}
        		temp = zero + singleMultiply(num1, Integer.parseInt(String.valueOf(num2.charAt(num2.length() - 1))));
        		res = plus(res, temp);
        		num2 = num2.substring(0, num2.length() - 1); 
        		count++;
        	}
        } else {
        	while (num1.length() != 0) {      		
        		for (int i = 0; i < count; i++) {
        			zero += 0;
        		}
        		temp = zero + singleMultiply(num2, Integer.parseInt(String.valueOf(num1.charAt(num1.length() - 1))));
        		res = plus(res, temp);
        		num1 = num1.substring(0, num1.length() - 1); 
        		count++;
        	}
        }
        StringBuffer sb = new StringBuffer(res);
        sb = sb.reverse();
        res = sb.toString();
        return res;
    }
    public String singleMultiply(String num1, int num2) {
    	String str = "";
    	int carry = 0;
    	while (num1.length() != 0 || carry != 0) {
    		if (num1.length() == 0) {
    			str += carry;
    			return str;
    		}
			int c = Integer.parseInt(String.valueOf(num1.charAt(num1.length() - 1)));
			int num = (c * num2 + carry) % 10;
			str += num;
			carry = (c * num2 + carry) / 10;
			num1 = num1.substring(0, num1.length() - 1);
    	}
    	// StringBuffer sb = new St 
    	return str;
    }
    public String plus(String num1, String num2) {
    	if (num1.length() == 0) return num2;
    	if (num2.length() == 0) return num1;
    	int carry = 0;
    	String str = "";
    	while (num1.length() != 0 || num2.length() != 0 || carry != 0) {
    		if (num1.length() == 0 && num2.length() == 0) {
    			str += carry;
    			return str;
    		} else if (num1.length() == 0) {
    			int num = Integer.parseInt(String.valueOf(num2.charAt(0))) + carry;
    			int n = num % 10;
    			str += n;
    			carry = num / 10;
    			num2 = num2.substring(1);
    			continue;
    		} else if (num2.length() == 0){
    			int num = Integer.parseInt(String.valueOf(num1.charAt(0))) + carry;
    			int n = num % 10;
    			str += n;
    			carry = num / 10;
    			num1 = num1.substring(1);
    			continue;
    		}
    		int num = Integer.parseInt(String.valueOf(num1.charAt(0))) + Integer.parseInt(String.valueOf(num2.charAt(0))) + carry;
    		int n = num % 10;
    		str += n;
    		carry = num / 10;
    		num1 = num1.substring(1);
    		num2 = num2.substring(1);
    	}
    	return str;
    }
}