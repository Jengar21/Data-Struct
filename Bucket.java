import java.util.LinkedList;

public class Bucket {
	LinkedList<String> list;
	
	public Bucket() {
		list = new LinkedList<String>();
	}
	
	public void add( String s) {
		list.add(s);
	}

}
