package leetcode;

public class L2130 {

	public int pairSum(ListNode head) {

		ListNode flag = head;
		ListNode first = head;
		while (flag.next.next != null) {
			first = first.next;
			flag = flag.next.next;
		}

		// reverse the second half of the list
		ListNode pre = null;
		ListNode current = first.next;
		while (current != null) {
			ListNode temp = current.next;
			current.next = pre;
			pre = current;
			current = temp;
		}

		// find the sum
		ListNode firstHalf = head;
		ListNode secondHalf = pre;

		int sum = 0;
		while (secondHalf != null) {
			int temp = firstHalf.val + secondHalf.val;
			firstHalf = firstHalf.next;
			secondHalf = secondHalf.next;
			sum = Math.max(sum, temp);
		}

		return sum;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);

		L2130 l = new L2130();

		int sum = l.pairSum(head);

		System.out.println(sum);
	}

}
