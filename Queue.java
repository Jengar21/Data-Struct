/*     enqueue O(1)
	   dequeue O(1)
	   no searching 
	   First in first out
*/

public class Queue {

	NodeQ head;
	NodeQ tail;
	
	public Queue() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		if(head==null)return true;
		return false;
	}
	
	public void enqueue(NodeQ n) {
		// is the list empty?
		if(head==null) {
			head = n;
			tail = n;
			return;
		}
		//put at the end 
		tail.next= n;
		tail=n;
	}
	
	public NodeQ dequeue() {
		// is the list empty?
		if(head==null) return null;
		
		NodeQ n = head;
		head = head.next;
		
		if(head==null) tail=null;
		
		return n;
		
	}

}
