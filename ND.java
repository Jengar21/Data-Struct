import java.util.ArrayList;

public class ND {
	String name;
	ArrayList<ND>neighbors;
	boolean visited;
	ND prev;
	
	
	public ND (String name) {
		this.name= name;
		this.neighbors= new ArrayList<ND>();
		this.visited=false;
		this.prev=null;
		
	}
	
	public void addNeighbor(ND n) {
		neighbors.add(n);
	}

}
