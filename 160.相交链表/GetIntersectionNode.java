import java.util.*;

public class GetIntersectionNode{
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	ListNode curA = headA;
    	ListNode curB =headB;
        Set<ListNode> s = new HashSet<ListNode>();
        while (curA != null) {
        	s.add(curA);
        	curA = curA.next;
        }
        while (curB != null) {
        	if (s.contains(curB)) return curB;
        	curB = curB.next;
        }
        return null;
    }
}