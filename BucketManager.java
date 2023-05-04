
public class BucketManager {

	//LinkedList<BucketLists> buckets;
	BucketLists[] buckets;

	public BucketManager() {

		buckets = new BucketLists[26];

		for (int i=0; i< 26; i++) {
			buckets[i]= new BucketLists();
		}
	}


	public void add(String data) {
		char c = (data.charAt(0));
		int index = c -'A' ;
		buckets[index].add(data);


	}

	public void print() {
		for(BucketLists buckets : buckets) {
			buckets.print();
		}
	}

	public void sort() {
		for (int i = 0; i < 26; i++) {
			buckets[i].sort();
		}
	}

}
