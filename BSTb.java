import java.util.*;
import java.util.Scanner;

public class BSTb {
	private static BSTb node;
	int data;
	BSTb left, right;
	BSTb(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
	public static void inpreOrder(BSTb root)
	{
		if (root != null) {
			inpreOrder(root.left);
			System.out.println(root.data);
			inpreOrder(root.right);
		}

	}
	public static void main(String [] args){
		BinarySearchTree<Integer> B = new BinarySearchTree<Integer>();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of test cases: ");
		int cases=scan.nextInt();
		System.out.println("---------------------------------");
		while (cases--!=0) {
			int n=scan.nextInt();
			for (int i = 1; i <= n; i++)
				B.insert(i);

			System.out.println("n= "+n);
			long start = System.nanoTime();
			boolean ans = B.contains(n + 1);
			long end = System.nanoTime();
			long totalTime=end-start;
			System.out.println("Balanced BST total time taken: "+totalTime+" nanoseconds");
		}
		inpreOrder(node);
	}

}
