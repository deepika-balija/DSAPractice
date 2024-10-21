package datastructures;
class ListNode2{
	int val;
	ListNode2 next;
	
	ListNode2(int val){
		this.val= val;
		this.next= null;
	}
}
public class SortedListMerging {

	public ListNode2 mergeTwoLists(ListNode2 l1, ListNode2 l2) {
		ListNode2 dummy= new ListNode2(-1);
		
		ListNode2 current =dummy;
		
		while(l1!=null && l2!=null) {
			if(l1.val <= l2.val) {
				current.next= l1;
				l1 = l1.next;
			}else {
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}
		
		if(l1 !=null) {
			current.next = l1;
		} else {
			current.next = l2;
		}
		return dummy.next;
	}
	
    public void printList(ListNode2 head) {
        ListNode2 current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedListMerging list= new SortedListMerging();
		
		 ListNode2 l1 = new ListNode2(1);
	        l1.next = new ListNode2(3);
	        l1.next.next = new ListNode2(5);

	        // Creating second sorted linked list: 2 -> 4 -> 6 -> null
	        ListNode2 l2 = new ListNode2(2);
	        l2.next = new ListNode2(4);
	        l2.next.next = new ListNode2(6);

	        // Print both input lists
	        System.out.println("List 1:");
	        list.printList(l1);

	        System.out.println("List 2:");
	        list.printList(l2);

	        // Merging the two sorted lists
	        ListNode2 mergedList = list.mergeTwoLists(l1, l2);

	        // Print the merged list
	        System.out.println("Merged List:");
	        list.printList(mergedList);
	    }
	}