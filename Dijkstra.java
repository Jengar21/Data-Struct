/*
 * Dijkstra Alg- finds the shortest path. Example of a greedy alg. uses a priority queue.
 */

import java.util.PriorityQueue;

public class Dijkstra {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		node3 a = new node3("A");
		node3 b = new node3("B");
		node3 c = new node3("C");
		node3 d = new node3("D");
		node3 e = new node3("E");
		node3 f = new node3("F");
		
		
		a.addNeighbors(2, b);
		a.addNeighbors(5, e);
		a.addNeighbors(3, d);
		
		d.addNeighbors(3, e);
		
		b.addNeighbors(2, e);
		b.addNeighbors(1, c);
		b.addNeighbors(3, f);
		
		c.addNeighbors(1, f);
		
		dijkstra(a,f);
		
	}
	
	public static void dijkstra(node3 start, node3 end) {
		PriorityQueue<node3>pq= new PriorityQueue<node3>();
		
		start.distance=0;
		pq.add(start);
		
		while(!pq.isEmpty()) {
			node3 current = pq.poll();
			if(current== end )break;
			
			for( edge e : current.neighbors) {
				int newDistance= current.distance + e.distance;
				node3 n = e.n; // look at neighbor
				
				if(newDistance > n.distance) continue;
				
				n.distance= newDistance;
				n.prev = current;
				pq.remove(n);
				pq.add(n);
			}
		}
		
		printReverse(end);
		System.out.println("total distance: "+ end.distance);
	}
	public static void printReverse(node3 n) {
		if(n==null) return;
		printReverse(n.prev);
		System.out.println(n.name);
	}

}
