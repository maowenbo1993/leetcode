import java.util.*;

public class RemoveNthFromEnd{
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer, ListNode> m = new HashMap<Integer, ListNode>();
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
        	m.put(count, cur);
        	count++;
        	cur = cur.next;
        }
        if (count == n) {
        	head = head.next;
        } else {
        	m.get(count - n - 1).next = m.get(count - n).next;
        }
        return head;
    }
}
// [Two pointers algorithm]
// public ListNode removeNthFromEnd(ListNode head, int n) {
//     ListNode dummy = new ListNode(0);
//     dummy.next = head;
//     ListNode first = dummy;
//     ListNode second = dummy;
//     // Advances first pointer so that the gap between first and second is n nodes apart
//     for (int i = 1; i <= n + 1; i++) {
//         first = first.next;
//     }
//     // Move first to the end, maintaining the gap
//     while (first != null) {
//         first = first.next;
//         second = second.next;
//     }
//     second.next = second.next.next;
//     return dummy.next;
// }