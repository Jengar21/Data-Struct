
public class Pizza implements Comparable<Pizza>{
	int priority;
	String description;
	
	public Pizza(int priority, String description) {
		this.priority= priority;
		this.description=description;
	}
	
	public int compareTo(Pizza other) {
		
		if(priority > other.priority) return -1;
		return 1;
	}
	
	public String toString() {
		return  priority + ":" + description;
	}

}
