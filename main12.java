/* merge sort review nlogn divide and conquer, requires n extra space.
 * quick sort nlogn, divide and conquer, picks a pivot element, moves smaller values to the left side of the array, moves greater values to the right side of the array
 * once they are split the smaller values on the left are never compared to the larger values on the right
 */

import java.util.ArrayList;
import java.util.Random;

public class main12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		ArrayList<Integer> a = new ArrayList<Integer>();

		for(int i=0; i<100; i++) {
			a.add(rand.nextInt(100));
		}

		print(a);
		System.out.println("-------");
		sort(a);
		print(a);

	}

	//Simplified QuickSort
	public static void sort(ArrayList<Integer>a) {
		if(a.size()<=1)return;

		// pick a pivot (middle element)
		int m= a.size()/2;
		int pivot = a.get(m);

		ArrayList<Integer> smaller = new ArrayList<Integer>();
		ArrayList<Integer> same = new ArrayList<Integer>();
		ArrayList<Integer> larger = new ArrayList<Integer>();

		for(Integer x:a) {
			if(x<pivot) {
				smaller.add(x);
			}
			else if (x> pivot) {
				larger.add(x);
			}
			else {
				same.add(x);
			}
		}
		
		sort(smaller);
		sort(larger);
		
		a.clear();
		a.addAll(smaller);
		a.addAll(same);
		a.addAll(larger);

	}

	public static void print(ArrayList<Integer>a) {
		for(Integer x:a) {
			System.out.println(x);
		}
	}

}
