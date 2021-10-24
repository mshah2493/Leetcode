/*
 
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 
*/

package practice;

import datastructure.ListNode;

public class AddTwoNumbers 
{	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) 
	{
		int len1 = length(l1);
		int len2 = length(l2);
		
		if (len1 < len2) l1 = padList(l1, len2 - len1);
		if (len1 > len2) l2 = padList(l2, len1 - len2);
		
		ListNode head = l1;
		ListNode node = null;
		boolean createLastNode = false;
		int reminder = 0;
		
		while(l1 != null) {
			l1.val += l2.val + reminder;
			
			if (l1.val > 9) {
				reminder = l1.val % 10;
				l1.val /= 10;
				
				if (l1.next == null) {
					createLastNode = true;
					l1.next = node;
				}
			} else {
				reminder = 0;
			}
			
			l1 = l1.next;
			l2 = l2.next;
		}
		
		if (createLastNode) {
			node = new ListNode(reminder);
			l1 = node;
		}
		
		return head;
	}
	
	public static ListNode padList(ListNode head, int padding) {
		for (int i = 0; i < padding; i++) {
			ListNode node = new ListNode(0);
			node.next = head;
			head = node;
		}
		
		return head;
	}
	
	public static int length(ListNode list) {
		int length = 0;
		
		while (list != null) {
			++length;
			list = list.next;
		}
		
		return length;
	}

	public static void main(String[] args) 
	{
		ListNode head1 = new ListNode().getList();
		ListNode head2 = new ListNode().getList2();
		
		ListNode head = addTwoNumbers(head1, head2);
		
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
