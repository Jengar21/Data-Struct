/*
 * 
 */


import java.util.LinkedList;
import java.util.Queue;
public class main16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ND a = new ND("A");		
		ND b = new ND("B");	
		ND c = new ND("C");	
		ND d = new ND("D");	
		ND e = new ND("E");	
		ND f = new ND("F");	

		a.addNeighbor(b);
		a.addNeighbor(d);
		a.addNeighbor(e);

		b.addNeighbor(a);
		b.addNeighbor(c);
		b.addNeighbor(e);
		b.addNeighbor(f);

		c.addNeighbor(b);
		c.addNeighbor(f);

		d.addNeighbor(a);
		d.addNeighbor(e);

		e.addNeighbor(a);
		e.addNeighbor(b);
		e.addNeighbor(d);

		f.addNeighbor(b);
		f.addNeighbor(c);

		bfs(a,f);

	}

	public static void bfs(ND start, ND end) {
		Queue<ND>q= new LinkedList<ND>();

		start.visited=true;
		q.add(start);

		while(!q.isEmpty()) {
			ND current= q.poll();
			if(current==end)break;

			for(ND n : current.neighbors) {
				if(n.visited)continue;//skip if we're been there 

				n.visited=true;
				n.prev=current;
				q.add(n);
			}
		}
		
		ND temp = end;
		while(temp != null) {
			System.out.println(temp.name);
			temp=temp.prev;
		}
		
		System.out.println("---");
		
		printReverse(end);
	}
	
	public static void printReverse(ND n) {
		if(n== null)return;
		printReverse(n.prev);
		System.out.println(n.name);
	}

}
