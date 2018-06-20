public class DeleteDuplicates{
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
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode cur = head;
    	ListNode p = head;
        while (p != null) {
        	if (cur.val != p.val) {
        		cur.next = p;
        		cur = cur.next;
        		p = p.next;
        	} else {
        		p = p.next;
        		cur.next = null;
        	}
        	
        }
        return head;
    }
}