public class RotateRight{
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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode last = dummy;
        ListNode first = dummy;
        ListNode l = dummy;
        int count = 0;
        while (l.next != null) {
        	count++;
        	l = l.next;
        }
        // if ( k == 0) return head;
        if (count == 0) return null;
        int n = k % count;
        for (int i = 0; i < n; i++) {
        	first = first.next;
        }  
  		if (n == 0) return head;      
        while (first.next != null) {
        	first = first.next;
        	last = last.next;
        }
        // if (dummy == last) {
        // 	return head;
        // }
        dummy.next = last.next;
        first.next = head;
        last.next = null; //dummy与last不能重合，否则dummy.next为空

        return dummy.next;
    }
}