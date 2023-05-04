import java.util.ArrayList;

public class node3 implements Comparable<node3> {
	String name;
	ArrayList<edge>neighbors;
	int distance ;
	node3 prev;
	
	public node3(String name) {
		this.name=name;
		this.neighbors = new ArrayList<edge>();
		this.prev= null;
		this.distance = Integer.MAX_VALUE;
	}
	
	public void addNeighbors(int distance, node3 n) {
		neighbors.add(new edge(distance,n));
		
		//add the reverse
		n.neighbors.add(new edge(distance,this));
	}
	
	public int compareTo(node3 other) {
		return Integer.compare(distance, other.distance);
	}
	

}
