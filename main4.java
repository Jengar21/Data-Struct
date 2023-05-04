import java.util.Random;

public class main4 {
	
	// O(n)
	public static void printMinMaxUnsorted(int[] a) {

		int min= Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;

		int n= a.length;

		for (int i =0; i<n; i++) {
			if (a[i]< min) min= a[i];
			if (a[i]> max) max= a[i];
		}
		System.out.println(min + " " + max);
	}
	
	// O(1)
	public static void printMinMaxSorted(int[] a) {
		
		int min = a[0];
		int max = a[a.length-1];
		System.out.println(min + " " + max);
	}

	public static void main(String[] args) {
		Random rand = new Random();

		int n= 1000;
		int[] a = new int [n];

		// unsorted list  
		for (int i =0; i<n; i++) {
			a[i]=rand.nextInt(10000);
		}
		printMinMaxUnsorted(a);

		// sorted list in order 
		for (int i =0; i<n; i++) {
			a[i]= i*2;
		}
		printMinMaxSorted(a);
	}
}