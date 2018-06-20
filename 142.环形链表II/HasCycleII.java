import java.util.*;

public class HasCycleII{
	public static void main(String[] args){
	
 	}
}
// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	public ListNode(int x) {
		val = x;
	}
}

class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode cur = head;
        Set<ListNode> s = new HashSet<ListNode>();
        while (cur != null) {
        	if (!s.contains(cur)) {
        		s.add(cur);
        		cur = cur.next;
        	} else return cur;
        }
        return null;
    }
}