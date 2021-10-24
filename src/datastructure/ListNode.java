package datastructure;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode() {}
	public ListNode(int val) { this.val = val; }
	public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	public void next(ListNode listNode) {
		next = listNode;
	}
	
	public ListNode getList() {
		ListNode head = new ListNode(1);
		head.next(new ListNode(2));
		head.next.next(new ListNode(3));
		
		return head;
	}
	
	public ListNode getList2() {
		ListNode head = new ListNode(4);
		head.next(new ListNode(5));
		head.next.next(new ListNode(6));
		head.next.next.next(new ListNode(7));
		
		return head;
	}
}
