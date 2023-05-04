
public class BucketList {
	Bucket[] buckets;
	
	public BucketList() {
		buckets = new Bucket[26];
		
		for (int i=0; i< 26; i++) {
			buckets[i]= new Bucket();
		}
	}
	
	public void add(String s ) {
		char c = s.toUpperCase().charAt(0);
		int index = (int)c;
		System.out.print(index);
	}

}
