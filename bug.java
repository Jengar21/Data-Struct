
public class bug implements Comparable<bug>{
	
	int priority;
	String description;
	
	public bug(int priority, String description) {
		this.priority= priority;
		this.description=description;
	}
	
	public int compareTo(bug other) {
		if(priority > other.priority) return -1;
		return 1;
	}
	
	public String toString() {
		return  "[" + priority + "]" + description;
	}
}
