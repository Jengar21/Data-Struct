import java.util.*;

public class Set<T>{
	//data fields
	private ArrayList<T> myList;

	// constructors
	Set(){
		this.myList= new ArrayList<T>();
		// CODE HERE
	}
	// other methods
	public void add(T item){
		if (myList.contains(item) == false) {

			myList.add(item);
		}// CODE HERE
	}
	public void remove(T item){
		if (membership(item)) {

			myList.remove(item);
		}// CODE HERE
	}
	public Boolean membership(T item){
		return myList.contains (item);
		// CODE HERE
	}
	public String toString(){

	
		return myList.toString();

		
	}
}