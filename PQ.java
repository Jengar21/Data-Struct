
public class PQ {
	// if doing a class. do an array of that
	int [] list;
	int size=0; // how many things are in thre
	
	public PQ(int capacity) {
		list = new int[capacity];
	}
	
	public boolean isEmpty() {
		if(size==0) return true;
		return false;
	}
	
	public void insert(int x) {
		int hole = size+1;
		
		while (true) {
			if(hole==1)break;
			int parent = hole/2;
			if(x>list[parent])break; // min heap bigger numbers at the bottom 
			list [hole]= list[parent];
			hole= parent;
		}
		
		list[hole]= x;
		size++;
	}
	
	public void debug() {
		for( int i = 1;i <=size; i++) {
			System.out.println(list[i]);
		}
	}

}
