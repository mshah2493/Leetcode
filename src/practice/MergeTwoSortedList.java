/*
 
Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists. 

Example 1:

Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: l1 = [], l2 = []
Output: []
Example 3:

Input: l1 = [], l2 = [0]
Output: [0]
 
Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both l1 and l2 are sorted in non-decreasing order.
  
 */

package practice;

import datastructure.ListNode;

public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        ListNode currNode = new ListNode();
        ListNode mergedList = currNode;
        
        while (l1 != null && l2 != null)
        {
            if (l1.val <= l2.val)
            {
                currNode.next = new ListNode(l1.val);
                currNode = currNode.next;
                l1 = l1.next;
            }
            else
            {
                currNode.next = new ListNode(l2.val);
                currNode = currNode.next;
                l2 = l2.next;
            }
        }
        
        while (l1 != null)
        {
            currNode.next = new ListNode(l1.val);
            currNode = currNode.next;
            l1 = l1.next;
        }
        
        while (l2 != null)
        {
            currNode.next = new ListNode(l2.val);
            currNode = currNode.next;
            l2 = l2.next;
        }
        
        return mergedList.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
