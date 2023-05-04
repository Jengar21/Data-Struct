import java.util.*;


class RandomQuickSort {
	
	static void QuickSort(int arr[], int low, int high)
	{
		if (low < high)
		{
			int pi = partition(arr, low, high);

			QuickSort(arr, low, pi-1);
			QuickSort(arr, pi+1, high);
		}
	}

	static void RandomQuickSort(int arr[], int low, int high)
	{
		Random random = new Random();
		int pivot = random.nextInt(high-low);
		
		
	}

	//Choose the pivot at random
	static int partition(int arr[], int low, int high)
	{
		RandomQuickSort(arr,low,high);
		int pivot = arr[high];
		int i = (low-1); 
		for (int j=low; j<high; j++)
		{
			if (arr[j] <= pivot)
			{
				i++;

				//exchange A[i] with A[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// exchange A[i+1] and A[j] 
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// Driver program
	public static void main(String args[])
	{
		int arr[] = {10, 100, 1000, 10000, 100000, 1000000};
		int n = arr.length;

		
		QuickSort(arr, 0, n-1);

		printArray(arr);
		
		// Question 3
				long startTime = System.nanoTime();
		        // linear search for size (which is not in the array)
				QuickSort(arr, 0, n-1);
		        // display the time elapsed
				System.out.println("The time taken by Random Quick Sort is " + (System.nanoTime() - startTime) + " nanoseconds.");
	}
}


