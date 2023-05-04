/* Bubble sort, Insertion sort, selection sort  n^2
 * Counting sort runs in linear time, "Non comparison", useful for integers when we know the exact range 
 * Radix sort "non comparison", sorts each column of digits in a number , old af
 * Bucket sort can be used with an array of linked list, use a sub sorting alg to sort each bucket 
 */

import java.util.Random;

public class main10 {
	public static void main(String[]args) {
		
		/*Counter sort
		final int COUNT = 1000;
		final int RANGE = 100;
		Random rand = new Random();
		// make an array of random numbers
		int[] a = new int[COUNT];
		
		//int[] counters = new int[RANGE];
		for(int i=0; i<COUNT;i++) {
			a[i]= rand.nextInt(RANGE);
		}
		// initialize counters
		int[] counters = new int[RANGE];
		for(int i=0; i<RANGE;i++) {
			counters[i]=0;
		}
		// travel linearly and count 
		for (int i=0; i<COUNT; i++) {
			int num = a[i];
			counters[num]++;
		}
		
		//print it 
		for(int i=0; i< RANGE;i++) {
			int c = counters[i];
			for(int j = 0; j<c; j++) {
				System.out.print(i);
			}
		}
		*/
		
		BucketList b = new BucketList();
		b.add("carmine");
	}

}
