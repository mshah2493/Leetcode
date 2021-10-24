/*
 
 Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
 

Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 

Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 
 */

package practice;

public class ReverseLinkedList {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		public void next(ListNode listNode) {
			next = listNode;
		}
	}
	
	public static ListNode reverse(ListNode head) {
		ListNode curr = head;
		ListNode prev = null;
		
		while (curr != null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		 
		return prev;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next(new ListNode(2));
		head.next.next(new ListNode(3));
		head.next.next.next(new ListNode(4));
		head.next.next.next.next(new ListNode(5));
		
		head = reverse(head);
		
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
