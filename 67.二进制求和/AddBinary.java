public class AddBinary{
	public static void main(String[] args){
		Solution s = new Solution();

		System.out.println(s.addBinary("11","1"));
	
 	}
}

class Solution {
    public String addBinary(String num1, String num2) {
        if (num1.length() == 0) return num2;
    	if (num2.length() == 0) return num1;
    	int carry = 0;
    	String str = "";
    	while (num1.length() != 0 || num2.length() != 0 || carry != 0) {
    		if (num1.length() == 0 && num2.length() == 0) {
    			str += carry;
    			StringBuffer sb = new StringBuffer(str);
                sb = sb.reverse();
                return sb.toString();
    		} else if (num1.length() == 0) {
    			int num = num2.charAt(num2.length() -1) - '0' + carry;
    			int n = num % 2;
    			str += n;
    			carry = num / 2;
    			num2 = num2.substring(0, num2.length() - 1);
    			continue;
    		} else if (num2.length() == 0){
    			int num = num1.charAt(num1.length() -1) - '0' + carry;
                int n = num % 2;
                str += n;
                carry = num / 2;
                num1 = num1.substring(0, num1.length() - 1);
                continue;
    		}
    		int num = num1.charAt(num1.length() -1) - '0' + num2.charAt(num2.length() -1) - '0' + carry;
    		int n = num % 2;
    		str += n;
    		carry = num / 2;
    		num1 = num1.substring(0, num1.length() - 1);
    		num2 = num2.substring(0, num2.length() - 1);
    	}
        // return str;
        StringBuffer sb = new StringBuffer(str);
        sb = sb.reverse();
    	return sb.toString();
    }
}