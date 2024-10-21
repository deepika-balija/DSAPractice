package datastructures;

class ListNode1 {
	int val;
	ListNode1 next;

	ListNode1(int val) {
		this.val = val;
		this.next = null;
	}

}

public class CycleDetection {

	public boolean hasCycle(ListNode1 head) {

		if (head == null || head.next == null) {
			return false;

		}

		ListNode1 slow = head;
		ListNode1 fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CycleDetection list = new CycleDetection();

		ListNode1 head = new ListNode1(1);
		head.next = new ListNode1(2);
		head.next.next = new ListNode1(3);
		head.next.next.next = new ListNode1(4);
		head.next.next.next.next = new ListNode1(5);

		System.out.println("Does the Linked List form cycle? " + list.hasCycle(head));
		head.next.next.next.next.next = head.next.next;

		System.out.println("Does the Linked List form cycle? " + list.hasCycle(head));
	}

}
