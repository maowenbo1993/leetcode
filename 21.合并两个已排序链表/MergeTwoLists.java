public class MergeTwoLists{
	public static void main(String[] args){
	
 	}
}


// Definition for singly-linked list.
public class ListNode {
	int val;
	ListNode next;
	public ListNode(int x) {
		val = x;
	}
}
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode head = new ListNode(0);
    	ListNode curr =head;
        while(l1 != null || l2 != null) {
        	if(l1 != null) {
        		curr.next = l1;
        		curr = curr.next;
        		l1 = l1.next;
        		if(l2 != null) {
        			curr.next = l2;
        			curr = curr.next;
        			l2 = l2.next;
        		}
        	} else {
        		curr.next = l2;
        		curr = curr.next;
        		l2 = l2.next;
        	}
        }
        return head.next;
    }
}
