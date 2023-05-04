// Last in first out 
public class Stack<T>{
	Node<T> head;
	
	public Stack() {
		head = null;

	}
	
	//0(1)
	public boolean isEmpty() {
		if(head== null)return true;
		return false;
	}
	
	// O(1)
	public void push(Node<T> n) {
		if(isEmpty()) {
			head = n;
			return;
		}
		
		n.next = head;
		head= n;
	}
	
	//O(1)
	public Node<T> pop() {
		if(isEmpty()) return null;
		
		Node<T> n = head;
		head= head.next;
		return n;
	}

}
