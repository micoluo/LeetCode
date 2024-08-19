package leetcode;

public class L2095 {

	public ListNode deleteMiddle(ListNode head) { // slow-fast pointer approach

		if (head.next == null) {
			return null;
		}

		ListNode fast = head;
		ListNode slow = head;
		ListNode prev = null;

		while (fast != null && fast.next != null) { // find the middle one
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;

		}
		prev.next = slow.next;
		return head;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		L2095 l = new L2095();

		head = l.deleteMiddle(head);

		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

}
