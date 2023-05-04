
public class LinkedListexam {
	Node head;
	Node tail;

	public LinkedListexam() {
		this.head = null;
		this.tail = null;

	}

	public void addToFront(Node n) {
		if( head==null) {
			head = n;
			tail = n;
			return;

		}
		n.next = head;
		head=n;
	}

	public void addToEnd(Node n) {
		if( tail==null) {
			head = n;
			tail = n;
			return;

		}
		tail.next = n;
		tail=n;
	}
	
	//public int sum() {
	//	return sum(head);
	//}
	
	//public int sum(Node n) {
		//if(head==null) return 0;
		//return n.minutes + sum(n.next);
	//}

}
