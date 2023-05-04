/* insertion sort n^2- special case if it already sorted it can run in n time, worst case if its in reverse 
 * bubble sort, we are bringing the highest number to the top,special case only if the data is sorted and 
 * you write an optimize version( sees if there was a swap in the last one) time is n
 * 
 *  merge sort- nlog(n) all the time, divide and conquer alg, requires n extra space
 */
import java.util.Random;
public class main11 {

	//helper
	public static void print(int[] a) {
		for(int i=0; i<a.length;i++) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();

		int n = 100;
		int[]  a = new int[n];

		//generate an array of random num
		for(int i=0; i<n; i++) {
			a[i]= rand.nextInt(100);
		}

		print(a);
		System.out.println();
		mergesort(a,0,n-1);
		print(a);
	}

	// "conquer" array/left/middle/right
	public static void merge(int[] a, int l, int m, int r) {
		int n= r-l+1; // the amount of things sorting

		int[] temp = new int[n]; //we sort into this array 

		int k=0; // index in temp space

		int p1 = l; // index on left side

		int p2= m+1; //index on right side

		// while we still have things in the list to compare
		while(p1<= m && p2<=r) {
			if(a[p1] < a[p2] ) {
				temp[k]=a[p1];
				p1++;
				k++;
			}
			else {
				temp[k]=a[p2];
				p2++;
				k++;
			}
		}

		//anything left over in left side?
		while(p1<=m) {
			temp[k++]= a[p1++];
		}

		//anything remaining on the right side?
		while(p2<=r) {
			temp[k++]= a[p2++];
		}

		//copy from temp to the og array
		for(int i=0; i<n;i++) {
			a[l+1]=temp[i];
		}
	}



	// divide
	public static void mergesort(int a[], int l, int r) {
		if( l< r) {
			int m = (l + r)/2;
			mergesort(a,l,m);
			mergesort(a,m+1,r);
			merge(a,l,m,r);
		}
	}

}
