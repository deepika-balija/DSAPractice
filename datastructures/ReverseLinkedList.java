package datastructures;

class ListNode{
	int val;
  ListNode next;
  
  ListNode(int val) {
	  this.val= val;
	  this.next=null;
}
  
}
 
 
public class ReverseLinkedList {

	
  public ListNode reverseList(ListNode head) {
		ListNode curr=head;
		ListNode prev= null;
	
	while(curr != null) {
		ListNode next = curr.next;
		curr.next =prev;
		prev=curr;
		curr= next;
		
	}
	
	return prev;
	}
	
	
  public void printList(ListNode head) {
		 ListNode current = head;
	        while (current != null) {
	            System.out.print(current.val + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	}
	

  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseLinkedList list=new ReverseLinkedList();		
		
		  ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);
	        
	        System.out.println("Original Linked List:");
	        list.printList(head);

ListNode recerveHead= list.reverseList(head);
System.out.println("Reversed Linked List:");
list.printList(recerveHead);
	}

}
