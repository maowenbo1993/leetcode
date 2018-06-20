public class CompareVersion{
	public static void main(String[] args){
		Solution s = new Solution();

		System.out.println(s.compareVersion("1","1.5"));
	
 	}
}
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int n1 = v1.length;
        int n2 = v2.length;
        int index = 0;
        while (n1 > index && n2 > index) {
        	int i1 = Integer.parseInt(v1[index]);
        	int i2 = Integer.parseInt(v2[index]);
        	if (i1 > i2) return 1;
        	else if (i1 < i2) return -1;
        	index++;
        }
        // System.out.println(v2.length);

        if (n1 > n2 && Integer.parseInt(v1[n1 - 1]) != 0) return 1;
        else if (n1 < n2 && Integer.parseInt(v2[n2 - 1]) != 0) return -1;
        else return 0;
    }
}