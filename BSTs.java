import java.util.*;
import java.util.Scanner;

public class BSTs{

	public static void main(String [] args){
		BinarySearchTree<Integer> S = new BinarySearchTree<Integer>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of test cases: ");
		int cases=scan.nextInt();
		System.out.println("---------------------------------");
		while (cases--!=0) {
			int n=scan.nextInt();
			for (int i = 1; i <= n; i++)
				S.insert(i);

			System.out.println("n= "+n);
			long start = System.nanoTime();
			boolean ans = S.contains(n + 1);
			long end = System.nanoTime();
			long totalTime=end-start;
			System.out.println("Skewed BST total time taken: "+totalTime+" nanoseconds");
		}
	}
}
