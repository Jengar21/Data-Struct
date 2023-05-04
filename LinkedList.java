
public class LinkedList {
	
	N head;
	
	public LinkedList() {
		head = null;
	}
	
	public void addFront(N n) {
		if(head==null)
		{
			head=n;
			return;
		}
		
		n.next=head;
		head=n;
	}
	
	public void print() {
		
		if(head==null)return;
		
		N current = head;
		
		while(current != null) {
			System.out.println(current.data);
			current= current.next;
		}
	}
	
	public int count() {
		if(head==null)return 0;
		
		int total=0;
		
		N current = head;
		while(current != null) {
			total++;
			current = current.next;
		}
		return total;
	}
	
	public N find(String search) {
		if(head==null)return null;
		
	
		N current = head;
		while(current!= null) {
			if(current.data.equals(search)) {
				return current;
			}
			current = current.next;
		}
		return null;
	}

	public int countR() {
		return countR(head);
	}

	int countR(N n) {
		if (n == null)return 0;
		return 1 + countR(n.next);

	}

}
