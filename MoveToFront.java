
import java.util.*;

public class MoveToFront<T>{

	private LinkedList<T> myList = new LinkedList<T>();

	MoveToFront(){
		this.myList= new LinkedList<T>();

	}
	
	// that adds an item to the collection, removing previous occurrences if there is any.
	public void push(T item){
		myList.remove(item);
		myList.add(item);
	}
	// that removes the item added the latest to the collection.
	public T pop(){
		return myList.remove();
		}
	
	// that returns true if a given item is in the collection, or false otherwise.
	public boolean contains(T item){
		return myList.contains(item);
		}
	
	// that returns true if the collection is empty, or false otherwise.
	public boolean isEmpty(){
		return myList.isEmpty();
		}

	// toString
	public String toString(){
		return myList.toString();
	}

}
