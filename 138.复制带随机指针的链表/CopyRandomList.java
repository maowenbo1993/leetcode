import java.util.*;

public class CopyRandomList{
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


 //[Definition for singly-linked list with a random pointer]
 class RandomListNode {
 	int label;
 	RandomListNode next, random;
 	RandomListNode(int x) { this.label = x; }
 };
 
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
    	RandomListNode cur = head;
     	Map<RandomListNode, RandomListNode> m = new HashMap<RandomListNode, RandomListNode>();
     	while (cur != null) {
     		m.put(cur, new RandomListNode(cur.label));
     		cur = cur.next;
     	}
     	cur = head;
     	while (cur != null) {
     		m.get(cur).next = m.get(cur.next);
     		m.get(cur).random = m.get(cur.random);
     		cur = cur.next;
     	}
     	return m.get(head);
    }
}