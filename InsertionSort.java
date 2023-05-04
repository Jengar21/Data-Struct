import java.util.*;

class InsertionSort {

	void InsertionSort(int array[]) {
		int size = array.length;

		for (int j = 2; j < size; j++) {
			int key = array[j];
			int i = j - 1;

			while (i >= 0 && key < array[i]) {
				array[i + 1] = array[i];
				--i;
			}

			array[i + 1] = key;
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();

	}
	public static void main(String args[])
	{
		int arr[] = {100, 10, 100000, 1000000, 1000, 10000};
		InsertionSort is = new InsertionSort();
		
		is.InsertionSort(arr);

		printArray(arr);
		
		// Question 3
				long startTime = System.nanoTime();
		        // linear search for size (which is not in the array)
				is.InsertionSort(arr);
		        // display the time elapsed
				System.out.println("The time taken by Insertion Sort is " + (System.nanoTime() - startTime) + " nanoseconds.");
	}
}
