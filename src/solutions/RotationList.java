package solutions;

import basicStructures.ListNode;

public class RotationList {
    public ListNode rotateRight(ListNode head, int n) {
        if (head==null||head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy,slow=dummy;

        int i;
        for (i=0;fast.next!=null;fast=fast.next,i++);
        for (int j=i-n%i;j>0;slow=slow.next,j--);
        
        fast.next=dummy.next;
        dummy.next=slow.next;
        slow.next=null;
        
        return dummy.next;
    }
}
