
// A linkList based Priority queue
public class TaskQueue {
	
	node2 head;
	
	public TaskQueue() {
		head = null;
	}
	
	public boolean isEmpty() {
		if(head==null) return true;
		return false;
	}
	
	public void insert (node2 n) {
		
		// is empty?
		if(head == null) {
			head = n;
			return;
		}
		
		// does the new node goes first?
		if( n.priority<= head.priority) {
			n.next = head;
			head = n;
			return;
		}
		
		node2 current = head;
		
		while (current.next!= null) {
			if(n.priority < current.next.priority) {
				n.next = current.next;
				current.next = n;
				return;
			}
			current=current.next;
		}
		current.next = n;
	}
	
	public node2 deleteMin() {
		if(head == null)return null;
		node2 result = head;
		head=head.next;
		return result;
	}

}
