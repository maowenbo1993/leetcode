import java.util.*;
public class GroupAnagrams{
	public static void main(String[] args){
		Solution s = new Solution();

		System.out.println(s.groupAnagrams(new String[]{"abd","fgg","adb","yui"}));
	
 	}
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strs) {
        	char[] charArr = s.toCharArray();
        	Arrays.sort(charArr);
        	String key = new String(charArr);
        	if (map.containsKey(key)) {
        		map.get(key).add(s);
        	} else {
        		List<String> l = new ArrayList<String>();
        		l.add(s);
        		map.put(key, l);
        	}
        }
        for (List<String> l : map.values()) {
        	res.add(l);
        }
        return res;
        //return new ArrayList(map.values());
    }
}