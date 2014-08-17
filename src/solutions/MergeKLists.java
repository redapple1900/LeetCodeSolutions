package solutions;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import basicStructures.ListNode;

public class MergeKLists {

    public ListNode mergeKLists(List<ListNode> lists) {
        if (lists.size()==0) return null;
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.size(),new Comparator<ListNode>(){

			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				if (o1.val<o2.val)
					return -1;
				else if (o1.val>o2.val)
					return 1;
				else
				return 0;
			}});
        for (int i=0;i<lists.size();i++)
        	if (lists.get(i)!=null)
        		queue.add(lists.get(i));
        while (!queue.isEmpty()){
        	tail.next=queue.poll();
        	tail=tail.next;
        	if (tail.next!=null)
        		queue.add(tail.next);
        }
        return dummy.next;
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;

        
        while ((l1!=null)&&(l2!=null)){
            if (l1.val<l2.val){
                tail.next=l1;               
                l1=l1.next;
            }else {
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        if (l1!=null) tail.next=l1;
        if (l2!=null) tail.next=l2;       
        return dummy.next;
    }

}
