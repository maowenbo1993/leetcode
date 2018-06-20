public class Partition{
	public static void main(String[] args){
		Solution s = new Solution();
		ListNode head = new ListNode(2);
		head.next = new ListNode(1);
		// head.next.next = new ListNode(2);
		// head.next.next.next = new ListNode(1);
		ListNode result = s.partition(head,2);
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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode small = dummy1;
        ListNode firstBig = null;
       	ListNode big = dummy2;
        ListNode cur = head;
        while (cur != null) {
        	if (cur.val < x) {
        		small.next = cur;
        		small = small.next;
        	} else {
                if (firstBig == null) firstBig = cur;
        		big.next = cur;
        		big =big.next;
        	}
        	cur = cur.next;
        }
        big.next = null;
        small.next = firstBig;
        return dummy1.next;
    }
}