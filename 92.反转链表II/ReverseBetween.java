import java.util.*;

public class ReverseBetween{
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	Map<Integer, ListNode> map = new HashMap<Integer, ListNode>();
    	ListNode cur = head;
        int count = 0;
        while (cur != null) {
        	map.put(count, cur);
        	count++;
        	cur = cur.next;
        }
        ListNode dummy =new ListNode(0);
        dummy.next = head;
        cur =dummy;
        for (int i = 1; i < m; i++) {
        	cur = cur.next;
        }
        ListNode temp = map.get(n - 1).next;
        for (int i = n - 1; i >= m - 1; i--) {
        	cur.next = map.get(i);
        	cur = cur.next;
        }
        cur.next = temp;
        return dummy.next;
    }
}

// [Reverse LinkedList]
// public ListNode reverseBetween(ListNode head, int m, int n) {
//     if(head == null) return null;
//     ListNode dummy = new ListNode(0); // create a dummy node to mark the head of this list
//     dummy.next = head;
//     ListNode pre = dummy; // make a pointer pre as a marker for the node before reversing
//     for(int i = 0; i<m-1; i++) pre = pre.next;
    
//     ListNode start = pre.next; // a pointer to the beginning of a sub-list that will be reversed
//     ListNode then = start.next; // a pointer to a node that will be reversed
    
//     // 1 - 2 -3 - 4 - 5 ; m=2; n =4 ---> pre = 1, start = 2, then = 3
//     // dummy-> 1 -> 2 -> 3 -> 4 -> 5
    
//     for(int i=0; i<n-m; i++)
//     {
//         start.next = then.next;
//         then.next = pre.next;
//         pre.next = then;
//         then = start.next;
//     }
    
//     // first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then = 4
//     // second reversing: dummy->1 - 4 - 3 - 2 - 5; pre = 1, start = 2, then = 5 (finish)
    
//     return dummy.next;
    
// }