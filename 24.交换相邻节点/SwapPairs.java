public class SwapPairs{
	public static void main(String[] args){
		Solution s = new Solution();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		// head.next.next = new ListNode(2);
		// head.next.next.next = new ListNode(1);
		ListNode result = s.swapPairs(head );
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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode last = dummy;
        ListNode fast = head;
        while (last.next != null && fast.next != null) {
        	last.next = fast.next;
        	ListNode temp = fast.next.next;
        	fast.next.next = fast;
        	fast.next = temp;       	
        	last = fast;
        	if (fast.next != null) fast = fast.next;
        	else return dummy.next;
        }
        return dummy.next;
    }
}

