import java.util.Random;

public class quicksort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();

		int[] a = new int[100];

		for(int i =0; i <100; i++) {
			a[i]= rand.nextInt(100);
		}

		print(a);
		System.out.println("-----");
		quicksort(a,0,a.length-1);
		print(a);

	}

	public static void print(int[] a) {
		for(int x: a) {
			System.out.println(x);
		}
	}


	// helper that just swaps
	public static void swap(int[]a , int p1, int p2) {

		int temp = a[p1];
		a[p1]=a[p2];
		a[p2]=temp;
	}

	// returns pivot location
	public static int partition(int[] a, int left, int right) {
		int pivot = right;
		int p1 = left;
		int p2 = pivot-1;
		
		while(p2 >= p1) {
			if(a[p1]> a[pivot]) {
				swap(a,p1,p2);
				swap(a,p2,pivot);
				p2= pivot-1;
				
			}
			else {
				p1++;
			}
		}
		
		return pivot;
	}
	
	
	public static void quicksort(int []a , int left, int right) {
		if(left<right) {
			int p = partition(a,left,right);
			quicksort(a,left,p-1);
			quicksort(a, p + 1, right);
		}
	}

}
