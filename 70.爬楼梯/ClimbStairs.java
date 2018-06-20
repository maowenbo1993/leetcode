import java.util.*;

public class ClimbStairs {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.climbStairs(3));
	}
}

class Solution {
    public int climbStairs(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
        	if (i == 0) res[i] = 1;
        	else if (i == 1) res[i] = 2;
        	else {
        		res[i] = res[i - 1] + res[i - 2];
        	}
        }
        return res[n - 1];
    }
}