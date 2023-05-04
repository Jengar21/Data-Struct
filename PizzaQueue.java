
public class PizzaQueue {
	Pizza [] list;
	int size;

	public PizzaQueue(int capacity) {
		size = 0;
		list = new Pizza[capacity+1];

	}

	public boolean isEmpty() {
		if(size==0) return true;
		return false;
	}

	public void insert (Pizza p) {

		// is empty?
		if(size == 0) {
			list[1]=p;
			size = 1;
			return;
		}

		//resize list
		Pizza[] newList = new Pizza[list.length * 2];
        for (int i = 1; i <= size; i++) {
            newList[i] = list[i];
        }
        list = newList;
        
		int hole = size+1;

		while (hole>1) {
			if(hole==1)break;
			int parent = hole/2;
			if (p.compareTo(list[parent]) >= 0) {
				break; // min heap: bigger numbers at the bottom
			}
			list [hole]= list[parent];
			hole= parent;
		}

		list[hole]= p;
		size++;
	}

	public Pizza delete() {

		if(isEmpty()) return null;

		Pizza result= list[1];
		list[1]=list[size--];
		//Pizza lastElement = list[size--];

		int hole = 1;

		while (true) {
			if(hole==1)break;
			int parent = hole/2;
			int lastElement= hole*2+1;
			if (lastElement<=size&& list[lastElement].compareTo(list[parent]) <0) {
				parent=lastElement; 
			}
			if(list[hole].compareTo(list[parent])<=0) {
				break;
			}
			Pizza temp= list[hole];
			list [hole]= list[parent];
			list[parent]=temp;
			hole=parent;
		}

		return result;
	}


	public void debug() {
		 System.out.println("--- DEBUG ---");
		for( int i = 1;i <=size; i++) {
			if (list[i] != null) {
				System.out.println(list[i]);
			}
		}
	}

	public void combine(PizzaQueue pq) {
		while (!pq.isEmpty()) {
			insert(pq.delete());
		}

	}
	
	public Pizza[] purge() {
	    Pizza[] orders = new Pizza[size];
	    for (int i = 0; i < size; i++) {
	        orders[i] = delete();
	    }
	    return orders;
	}

}
