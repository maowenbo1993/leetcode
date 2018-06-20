import java.util.*;

public class InsertionSortList{
	public static void main(String[] args){
		Solution s = new Solution();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode result = s.reverseBetween(head,2,4);
		while (result != null) {
			System.out.print(result.val);
			result = result.next;
		}
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
    public ListNode insertionSortList(ListNode head) {
    	if (head == null || head.next == null) return head;
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	ListNode cur = head;
        Map<ListNode, ListNode> m = new HashMap<ListNode, ListNode>();
        while (cur.next != null) {
        	m.put(cur.next, cur)
        	cur = cur.next;
        }
        cur = head.next;
        ListNode pre = dummy;
        while (cur != null) {
        	while (m.get(cur) != null) {
        		if (cur.val < m.get(cur).val) {
        			m.get(cur).next = cur.next;
        			cur.next = m.get(cur);
        			pre.next = cur;
        		}
        		cur = m.get(cur);
        	}
        	cur = cur.next;
        }
    }
}