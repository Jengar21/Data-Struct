import java.util.*;  

public class PriorityQueue 
{    
	public static void main(String[] args) 
	{    
		Scanner scan = new Scanner(System.in);   
		int val = 0;         

		System.out.println("Enter number please: ");        
		int n = scan.nextInt();                

		List<Integer> list = new ArrayList<Integer>();         
		Random random = new Random();             
		while (list.size() <= n){             
			val = random.nextInt();             
			if (list.contains(val) == false)
			{                 
				list.add(val);            
			}         
		} 



		PriorityQueue pq = new PriorityQueue();         
		long startTime = System.nanoTime();         
		// add n integers   
		for (int i = 0; i < n; i++)
		{             
			pq.add(list.get(i));         
		}         
		// extract the integers         
		for (int j = 0; j < n; j++){            
			pq.pop();         
		}         
		long totalTime = System.nanoTime() - startTime;         
		System.out.println("Time taken to insert and remove " + n + " in Java API Priority Queue is: " + totalTime  + " nonoseconds");         

	}
	private void add(Integer integer) {

	}

	private void pop() {

	}
} 






