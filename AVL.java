import java.io.*;
import java.util.*;

public class AVL extends AvlTree {
	

	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		Hashtable<Integer, Integer> myHT = new Hashtable<Integer,Integer>(1000);

		int n=scan.nextInt();
		// Measuring Time for HashTable
		for (int i = 1; i <= n; i++) {
			myHT.put(i,0);
		}
		long start = System.nanoTime();
		boolean ans = myHT.contains(n + 1);
		long end = System.nanoTime();
		long totalTime=end-start;
		System.out.println("HashTable time taken: "+totalTime+" nanoseconds");
		
		//measuring time for AVLTree
		AvlTree<Integer> myAVL = new AvlTree<Integer>();
		int n2=scan.nextInt();
		for (int i=1; i<=n; i++) {
			myAVL.insert(i);
		}
		long start2 = System.nanoTime();
		boolean ans2 = myAVL.contains(n2+1);
		long end2 = System.nanoTime();
		long totalTime2=end2-start2;
		System.out.println("AVL time taken: "+totalTime2+" nanoseconds");
	}
}
