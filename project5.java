/*
  Your Name:  Jennifer Garcia
  Pace Email: jg34071n@pace.edu
Merge Sort:
  For Merge Sort, what is the worst case big O and what kind of input would cause
that? Given your implementation of Merge Sort, what is the best case big O and
what kind of input would cause that?

The worst case big O for merge would be nlogn, the input that would case this would be if its not sorted or in reverse order.
The best case would still be nlogn, but this would happen if the array is already sorted. 
 */
public class project5 {
	
	public static void main(String[] args) {
		BucketManager bm = new BucketManager();
		bm.add("Be the very best. Like no one ever was.");
		bm.add("Finish watching the Squid Game.");
		bm.add("Make sourdough bread.");
		bm.add("Complete a masters in Computer Science.");
		bm.add("Learn an instrument.");
		bm.add("Complete a bachelors in Computer Science.");
		bm.add("Complete a PhD in Computer Science.");
		bm.add("Apply to college.");
		bm.add("Become a starship captain.");
		bm.print();
		System.out.println("----");
		bm.sort();
		bm.print();
	}
}