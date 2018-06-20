import java.util.*;

public class LargestNumber {
	public static void main(String[] args) {
	
	}
}
class Solution {
	private class NumComparator implements Comparator<String> {
		@Override
    	public int compare(String s1, String s2) {
    		String a = s1 + s2;
    		String b = s2 + s1;
    		return b.compareTo(a);
    	}
    }
    public String largestNumber(int[] nums) {
        
    	String[] str = new String[nums.length];
    	for (int i = 0; i < nums.length; i++) {
    		str[i] = String.valueOf(nums[i]);
    	}
    	Arrays.sort(str, new NumComparator());
    	if (str[0].equals("0")) return "0";
    	String res = "";
    	for (String s : str) {
    		res += s;
    	}
    	return res;
    }
}