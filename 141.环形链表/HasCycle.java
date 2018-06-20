import java.util.*;

public class HasCycle{
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
    public boolean hasCycle(ListNode head) {
        Set<ListNode> s = new HashSet<ListNode>();
        while (head != null) {
        	if (!s.contains(head)) {
        		s.add(head);
        		head = head.next;
        	} else return true;
        }
        return false;
    }
}