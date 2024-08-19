package leetcode;

public class L206 {

	public ListNode reverseList(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode before = null;
		ListNode current = head;

		while (current != null) {
			ListNode after = current.next;
			current.next = before;
			before = current;
			current = after;
		}

		return before;
	}
	
	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		L206 l = new L206();

		head = l.reverseList(head);

		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

}
