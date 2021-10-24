package practice;

import datastructure.ListNode;

public class LinkedListFindCycle {
	
	public static ListNode hasLoop(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next; 
			fast = fast.next.next;
			
			if (slow == fast) {
				break;
			}
		}
		
		if (fast == null || fast.next == null) {
			return null;
		}
		
		slow = head;
		
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return fast;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
