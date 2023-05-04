import java.util.*;  

public class MyPriorityQueue<T extends Comparable<T>>
{      
	public LinkedList<T> Myq; 

	public MyPriorityQueue() {         
		Myq = new LinkedList<T>();     
	}     
	public boolean empty (){        
		return Myq.isEmpty();     
	}     

	public void Insert (T key) { 
		int index=0;
		ListIterator<T> iter = Myq.listIterator(0);
		while((iter.hasNext())&& (iter.next().compareTo(key )<0))
		index++;
		Myq.add(index, key);  
	}

	public void ExtractMin () {         
		Myq.removeFirst();     
	}
} 

