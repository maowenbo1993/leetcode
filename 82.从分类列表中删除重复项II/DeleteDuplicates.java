import java.util.*;

public class DeleteDuplicates{
	public static void main(String[] args){
		Solution s = new Solution();
		ListNode head = new ListNode(4);
		head.next = new ListNode(3);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		ListNode result = s.deleteDuplicates(head);
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
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode cur = head;
    	ListNode l = head;
        Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>(); //按插入顺序保存键
        while (cur != null) {
        	if (!m.containsKey(cur.val)) {
        		m.put(cur.val, 1);
        	} else {
        		m.put(cur.val, m.get(cur.val) + 1);
        	}
        	cur = cur.next;
        }
        while (l != null) {
        	if (m.containsKey(l.val) && m.get(l.val) > 1) m.remove(l.val); //m.containsKey(l.val) 没有键值则返回null
        	l = l.next; 
        }
        ListNode dummy = new ListNode(0);
        ListNode ll = dummy;
        for (int key : m.keySet()) {
        	ll.next = new ListNode(key);
        	ll = ll.next;
        }
        return dummy.next;
    }
}

// [delete one uplicate]
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//     	ListNode dummy = new ListNode(0);
//     	dummy.next = head;
//     	ListNode last = dummy;
//     	ListNode cur = head;
//         Set<Integer> s = new HashSet<Integer>();
//         while (cur != null) {
//         	if (!s.contains(cur.val)) {
//         		s.add(cur.val);
//         		last.next = cur;
//         		last = last.next;
//         		cur = cur.next;
//         	} else {
//         		cur = cur.next;
//         	}
//         }
//         return dummy.next;
//     }
// }