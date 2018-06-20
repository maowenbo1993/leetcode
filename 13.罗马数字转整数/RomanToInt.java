public class RomanToInt{
	public static void main(String[] args){
		Solution s = new Solution();
		String ss = "CMXLIII";
		System.out.println(s.romanToInt(ss));
 	}
}

class Solution {
    public int romanToInt(String s) {
        char[] array = s.toCharArray();
        int[] num = new int[array.length];
        int sum = 0;
        for(int i = 0; i < array.length; i++){
        	switch(array[i]){
        		case 'I':
        		 	num[i] = 1;
        		 	break;
        		case 'V':
        			num[i] = 5;
        			break;
        		case 'X':
        		 	num[i] = 10;
        		 	break;
        		case 'L':
        		 	num[i] = 50;
        		 	break;
        		case 'C':
        		 	num[i] = 100;
        		 	break;
        		case 'D':
        		 	num[i] = 500;
        		 	break;
        		case 'M':
        		 	num[i] = 1000;
        		 	break;
        	}
        }
        for(int i = 0; i < num.length - 1; i++){
        	sum += (num[i] < num[i+1]) ? -num[i] : num[i];
        }
        sum += num[num.length - 1];

        return sum;        
    }
}