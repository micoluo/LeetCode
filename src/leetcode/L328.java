package leetcode;

public class L328 {
	
	public ListNode oddEvenList(ListNode head) { 
		
		if (head == null || head.next == null) {
			return head; 
		}
		
		ListNode odd = head;
		ListNode even= head.next;
		ListNode evenhead = even;

		while (even != null && even.next != null) { 
		    odd.next = even.next; // Link odd-indexed node to the next odd-indexed node
		    odd = odd.next; // Move odd pointer to the next odd-indexed node
		    even.next = odd.next; // Link even-indexed node to the next even-indexed node
		    even = even.next; // Move even pointer to the next even-indexed node
		}
		
		odd.next = evenhead; // Link the last odd-indexed node to the head of the even-indexed list
		return head;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);

		L328 l = new L328();

		head = l.oddEvenList(head);

		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

}
