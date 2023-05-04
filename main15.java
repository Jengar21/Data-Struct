 /*
 * Priority queue- useful for job/task queueing:
 * printer queue
 * operating systems processes
 * some path finding alg
 * insert O(n) and deletMin O(1)
 * 
 * heap O(logn) - 
 * visualize as a binary tree, 
 * Min-heap (all nodes below are more than), 
 * Max-heap( all nodes below are less than)
 * we use an array 
 * left child = 2i
 * right child = 2i+1
 * parent= i/2
 * insert logn 
 * delet- logn
 */

//import java.util.PriorityQueue;
import java.util.Random;

public class main15 {

	public static void main(String[] args) {
		/*
		TaskQueue t = new TaskQueue();
		
		t.insert(new node2( 10, "replace monitor"));
		t.insert(new node2( 5, "replace printer"));
		t.insert(new node2( 1000, "water plants"));
		t.insert(new node2( 1, "fix coffee"));
		
		while(!t.isEmpty()) {
			node2 n = t.deleteMin();
			System.out.println(n.task);
		}
	
		
		PriorityQueue<bug> pq = new PriorityQueue<bug> ();
		
		pq.add(new bug(10, "computer reboots rand"));
		pq.add(new bug(1, "wrong font"));
		pq.add(new bug(100, "system crash"));
		
		while (!pq.isEmpty()) {
			bug b = pq.poll(); // remove
			System.out.println(b);
		}
		*/
		
		Random rand = new Random();
		
		PQ pq = new PQ (100);
		
		for( int i = 0; i<20; i++) {
			pq.insert(rand.nextInt(100));
		}
		
		pq.debug();
	}

}
