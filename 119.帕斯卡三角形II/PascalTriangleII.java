import java.util.*;

public class PascalTriangleII{
	public static void main(String[] args){
		Solution s = new Solution();
		int[] arr = {1,3,5,5,6};
		System.out.println(s.getRow(5));
	}
}

class Solution {
    public List<Integer> getRow(int numRows) {
        numRows++;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0) return new ArrayList<Integer>();
        else {
        	List<Integer> row1 = new ArrayList<Integer>();
        	row1.add(1);
        	result.add(row1);
        	for (int i = 1; i < numRows; i++) {
        		List<Integer> l = new ArrayList<Integer>();
        		List<Integer> pre = result.get(i - 1);
        		l.add(1);
        		for (int j = 1; j < i; j++) {
        			l.add(pre.get(j - 1) + pre.get(j));
        		}
        		l.add(1);
        		result.add(l);
        	}
        }
        return result.get(numRows - 1);
    }
}