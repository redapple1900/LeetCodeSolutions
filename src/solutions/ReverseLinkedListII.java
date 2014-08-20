package solutions;

import basicStructures.ListNode;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if (head==null||head.next==null) return head;
    	ListNode dummy=new ListNode(0);
    	dummy.next=head;    	
    	ListNode fast=dummy,slow=dummy;
    	
    	for (int i=n;i>0;i--)
    		fast=fast.next;
    	ListNode tail=fast.next;
    	fast.next=null;
    	
    	for (int i=m-1;i>0;i--)
    		slow=slow.next;
    	ListNode temp=slow.next;
    	
    	slow.next=reverseLinkedListByRecursion(slow.next);
    	temp.next=tail;
    	return dummy.next;
    }
    
    public ListNode reverseLinkedListByRecursion(ListNode head){
    	if (head==null||head.next==null) return head;
    	ListNode result=reverseLinkedListByRecursion(head.next);
    	head.next.next=head;
    	head.next=null;
    	return result;
    }
}
