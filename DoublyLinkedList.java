/*
  Your Name:  Jennifer Garcia
  Pace Email: jg34071N@pace.edu

Write a few sentences about some of the special cases and considerations you had
when working on the insert and remove methods.

When writing the insert and remove methods i had to considered the fact that if I were to misplaced the ordered 
of the code I would lose the position of the code forever.
It was pretty difficult because I didn't even know how the format should go, there were a lot of trail and 
error until the code finally compiled correctly. 
 */

public class DoublyLinkedList {

	NodeDLL head;
	NodeDLL tail;

	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	//insert a node in alphabetical order
	public void insert(String name){
		NodeDLL n = new NodeDLL(name);

		//check if empty
		if(head==null) {
			head = n;// change to n
			tail = n;
			return;
		}
		//n.data = name;
		//head.next = n;
		NodeDLL current = head;
		NodeDLL tail = null;

		while(current !=null){
			if(current.data.compareTo(n.data)>0) {
				NodeDLL temp = current.prev;
				current.prev = n;
				n.next = current;
				n.prev = temp;
				if(temp != null) {
					temp.next =n;
				}else {
					head = n;
				}
				break;
			}
			tail = current;
			current = current.next;
		}
		if(current == null) {
			tail.next = n;
			n.prev = tail;
			tail = n;
			//should this go first
			//should this go last 
			//traverse the list
			// the new ones current is the prev and the currents prev is the new one 
		}
	}


	public void remove(String name) {
		NodeDLL n = new NodeDLL(name);


		NodeDLL current = head;
		if(current==null) {
			current = n.next;
		}
		
		if(n.next != null){
			n.next.prev = n.prev;
		}
		if(n.prev != null){
			n.prev.next = n.next;
		}
		return;
		//should we remove the first one if head.data.equals(name)
		//should we remove the last one if current.data.equals(name)
		//traverse the list
	}

	public NodeDLL find(String search) {
		NodeDLL current =head;
		while(current!=null) {
			if(current.data.equals(search))
				return current;
			current=current.next;
		}
		return current;
	}

	public NodeDLL getFirst() {
		return head;
	}
	public NodeDLL getLast() {
		return tail;
	}

	public void print() {
		NodeDLL current = head;
		while (current != null) {
			System.out.print(current.data + " " );
			current = current.next;

		}

	}
	public void printReverse() {
		NodeDLL current = tail;
		while (current != null) {
			System.out.print(current.data + " " );
			current = current.prev;
		}

	}
	public static void main(String[] args){

		DoublyLinkedList DLL = new DoublyLinkedList();

		DLL.insert("Dog");
		DLL.insert("Cat");
		DLL.insert("Fish");
		DLL.insert("Ant");

		DLL.print();
		System.out.println();
		System.out.println();

		DLL.printReverse();
		System.out.println();
		System.out.println();

		DLL.remove("Dog");
		DLL.print();
		System.out.println();

		//get first and get last method
		System.out.print("Get First and Last values:");
		DLL.getFirst();
		DLL.getLast();

		System.out.println();

		// find method 
		System.out.println("Find Cat");
		DLL.find("Cat");
		System.out.println("Cat" + DLL.find("Cat"));





	}

}


