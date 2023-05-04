
public class weaponList {

	weapons[] list;
	int next = 0;

	public weaponList() {
		list = new weapons[2];
	}

	public int capacity() {
		return list.length;
	}

	public int count() {
		return next;
	}

	public void expand() {
		System.out.println("Expanding...");
		int old_size = capacity() * 2;
		int new_size = old_size*2;

		weapons[] newlist = new weapons[new_size];

		for(int i=0; i < count(); i++) {
			newlist[i]= list[i];
		}
		
		list=newlist;
	}


	public void add(weapons w) {
		if (next == capacity()) expand();
		System.out.println("Adding " + w);
		list[next++]=w;

	}
	
	public void remove(String name) {
		remove(indexOf(name));
	}
	
	public void remove(int x) {
		for(int i = x; i<count(); i++) {
			list[i]=list[i+1];
		}
		next --;
		list[next]=null;
	}

	//O(n)
	public void print() {
		System.out.println("------------------");
		for(int i=0; i< count(); i++) {
			System.out.println(list[i]);
		}
	}

	//)(n)
	public int indexOf(String name) {
		for(int i=0; i< count();i++) {
			if(list[i].name.equals(name)) {
				return i;
			}
		}
		return -1;
	}


	//O(1)
	public weapons get(int i) {
		return list[i];
	}

	//O(1)
	public void set(int i, weapons w) {
		list[i]=w;
	}

}
