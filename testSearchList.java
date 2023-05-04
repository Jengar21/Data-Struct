/*
 Your Name : [Jennifer Garcia]
 Pace Email : Jg34071n@pace.edu

 Record the time for the following search:
Linear Search:
          1: 6803167 nanoseconds.
        100: 10490583 nanoseconds.
      1,000: 10217958 nanoseconds.
     10,000: 10186750 nanoseconds.
    100,000: 8375125 nanoseconds.
  1,000,000: 13144334 nanoseconds.
  1,000,001: 13794750 nanoseconds.


Binary Search:
          1: 190459 nanoseconds.
        100: 594792 nanoseconds.
      1,000: 1247916 nanoseconds.
     10,000: 225291 nanoseconds.
    100,000: 339459 nanoseconds.
  1,000,000: 14667 nanoseconds.
  1,000,001: 9417 nanoseconds.


Write a couple sentences about what you observed:

I've notice for the linear search the running time almost stayed at a constant time from 100-10,000. 
Then decreased at 100,000 and then increased again from 1,000,000 to stay at a constant for 1,000,001.  
The same thing happened for the binary time search, but the binary time search was significantly a lot faster than the linear time search.
I'm not sure why it took the shortest amount of time to search for 1,000,001 in the binary time search, my guess if because its at the end if the array list.  
 */
import java.util.*;
import java.util.ArrayList;

public class testSearchList {

	public static int linearSearch(int a[], int search) {
		for(int i=0; i<a.length; i++){
			if(a[i]==search)return 1;
		}
		return -1;
	}

	public static int binarySearch(int a[], int search) {
		int low = 0;
		int high = a.length -1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid]>search) {
				high = mid - 1;
			} else if (a[mid]<search) {
				low = mid + 1;
			} else {
				return 1;
			}
		}
		return -1;
	}

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number to search: ");
		int num = input.nextInt();

		System.out.println();


		int n= 1000000;
		int[] arr = new int [n];


		for(int i=num; i<n; i++){
			arr[i]=i*2;
		}

		// linear search for number and time
		long startTime = System.nanoTime();

		linearSearch(arr,num);
		System.out.println("The time taken by Linear Search is " + (System.nanoTime() - startTime) + " nanoseconds.");

		// binary search for number and time
		startTime = System.nanoTime();
		binarySearch(arr,num);
		System.out.println("The time taken by Binary Search is " + (System.nanoTime() - startTime) + " nanoseconds.");
	}

}






