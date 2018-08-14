
public class DoublyLinkedList1 {

	private DoublyLinkedNode head;
	
	public void insertAhead(int data){
		
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		
		newNode.setNextNode(this.head);
		
		
	}
	
}
