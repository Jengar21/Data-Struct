/* Hashing O(1) to add something and find something and to delete
 * can't sorting, find min or max 
 * great for key and values types of problems: compilers (symbol table), internet routers (ip- route), servers ( port- applications), spell checking, security
 * if we are sorting integers we could use - number % table_size
 * something thats very easy to calc, hoping for a uniform distribution, no or few collision 
 * chaining for collision
 */

import java.util.HashMap;
import java.util.Scanner;


public class main14 {
	public static void main( String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*	
		HashMap<String, Double> grades = new HashMap<String, Double>();
		
		grades.put("carmine", 3.0);
		grades.put("frank", 3.6);
		grades.put("christelle", 4.0);
		
		System.out.println("who do you want to find");
		String key = scan.nextLine();
		if (grades.containsKey(key)) {
			System.out.println(grades.get(key));
		}else {
			System.out.println("not found");
		}
		
		//Double x = grades.get("carmine");
		//System.out.println(x);
		 */
		
		HashMap<Integer,Student1> students = new HashMap< Integer, Student1>();
		
		
		Student1 Carmine = new Student1("Carmine", 4.0," email");
		students.put(1234, Carmine);
		
		Student1 Frank = new Student1("Frank", 3.6," emailstuff");
		students.put(5678, Frank);
		
		Student1 x = students.get(1234);
		System.out.println(x.name);
		
	}

}
