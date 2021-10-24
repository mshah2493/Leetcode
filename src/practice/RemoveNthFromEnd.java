package practice;

import datastructure.ListNode;

public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;

        for (int i = 0; i < n; i++) {
            if (first.next == null) {
                if (i == n - 1) {
                    head = head.next;
                    
                    return head;
                }

                break;
            }
            
            first = first.next;
        }
 
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
 
        second.next = second.next.next;
        
        return head;
    }
}
