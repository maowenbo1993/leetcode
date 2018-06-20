public class AddTwoNum {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(8);
		ListNode l2 = new ListNode(3);
		l1.next = new ListNode(9);
		// l2.next = new ListNode(6);
		
		Solution s = new Solution();
		ListNode ll = s.addTwoNumbers(l1,l2);
		System.out.println(""+ll.val+" "+ll.next.val);
 	}
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode((l1.val + l2.val) % 10);
        ListNode p = l;
        int carry = (l1.val + l2.val < 10) ? 0 : 1;
        int val1 = 0;
        int val2 = 0;
        while (l1.next != null || l2.next != null || carry == 1) {
           
            // val1 = (l1 != null) ? l1.val : 0;
            // val2 = (l2 != null) ? l2.val : 0;
            if(l1.next != null) { 
                l1 = l1.next; 
            } else {
                l1.val = 0;
            }
            if(l2.next != null) { 
                l2 = l2.next; 
            }  else {
                l2.val = 0;
            }         
            p.next = new ListNode((l1.val + l2.val + carry) % 10);
            carry = (l1.val + l2.val + carry < 10) ? 0 : 1;
            p = p.next;
        }
        return l;
    }
}

// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode l = new ListNode((l1.val + l2.val) % 10);
//         ListNode p = l;
//         while(l1.next!=null && l2.next!=null){
//         	int n;
//         	if(l1.val+l2.val<10){
//         		n = 0;
//         	}else{
//         		n = 1;
//         	}
//         	l1 = l1.next;
//         	l2 = l2.next; 
//         	if(n == 0){
//         		p.next = new ListNode((l1.val + l2.val) % 10);
//         	}else{
//         		p.next = new ListNode((l1.val + l2.val + 1) % 10);
//         	}   	       	
//         	p = p.next;
//         }
//         int m;
//         if(l1.val + l2.val > 9){
//         	m = 1;
//         }else{
//         	m = 0;
//         }
//         if(l1.next == null && l2.next == null){
//         	if(m==1){
//         		p.next = new ListNode(1);
//         	}
//         }else if(l1.next == null){
//         	while(l2.next!=null){
//         		l2 = l2.next;
//         		if(m==0){
//         			p.next = new ListNode(l2.val);
//         		}else{
//         			p.next = new ListNode((l2.val+1)%10);
//         		}
//         		p = p.next;       		
//         	}
//         }else{
//         	while(l1.next!=null){
//         		l1 = l1.next;
//         		if(m==0){
//         			p.next = new ListNode(l1.val);
//         		}else{
//         			p.next = new ListNode(l1.val+1);
//         		}
//         		p = p.next;        		
//         	}
        	
//         }

//         return l;       
//     }
// }