import java.util.ArrayList;


public class BucketLists {
	ArrayList<String> list;

	public BucketLists() {
		list = new ArrayList<>();
	}

	public void add( String data) {
		list.add(data);
	}


	public void print() {
		for(String list : list) {
			System.out.println(list);
		}
	}

	// with merge sort 
	public void sort() {
		merge(list);

	}

	public void merge(ArrayList<String> list) {

		// middle 
		int m = list.size() / 2; 

		if (list.size() <= 1) {
			return;
		}


		ArrayList<String> l = new ArrayList<>(list.subList(0, m));
		ArrayList<String> r = new ArrayList<>(list.subList(m, list.size()));

		merge(l);
		merge(r);

		int p1 = 0;
		int p2 = 0;
		int k = 0;

		// while we still have things in the list to compare & ignore case
		while (p1 < l.size() && p2 < r.size()) {
			if (l.get(p1).compareToIgnoreCase(r.get(p2)) <= 0) {
				list.set(k++, l.get(p1++));
			} else {
				list.set(k++, r.get(p2++));
			}
		}

		//anything left over in left side?
		while (p1 < l.size()) {
			list.set(k++, l.get(p1++));
		}

		//anything remaining on the right side?
		while (p2 < r.size()) {
			list.set(k++, r.get(p2++));
		}

	}
}





