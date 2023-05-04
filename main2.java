import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class main2 {
	public static void main(String[] args) {
		/*int x=0;
		Integer y=0;
		Double z=5.0;

		String name;

		Container c = new Container ();
		c.set(y);

		Container c2= new Container();
		c2.set(name);

		System.out.println(c.get);

	    item<Integer>shoe = new item<Integer>();
		shoe.set(12345, "New Balance");
		shoe.print();

		item<String> ipad = new item<String>();
		ipad.set("ABCD", "Ipad Pro");
		ipad.print();
		

		pair<String, String> p = new pair<String, String>();
		p.set("jen", "cool");
		p.print();
		
		item<String> ipad= new item<String>();
		ipad.set("stuff", "Stuff");
		
		pair<String, item<String>> inventory = new pair<String, item<String>>();
		inventory.set("ddd", ipad);
		
		
		 Scanner scan= new Scanner(System.in);
		 
		 ArrayList<Integer> a = new ArrayList<Integer>();
		 
		 System.out.println("Enter some number, Enter -1 when done,");
		 
		 while(true) {
			 System.out.println("Enter a number: ");
			 Integer x = scan.nextInt();
			 if(x<0)break;
			 
			 a.add(x);
			 
		 }
		 Collections.sort(a);
		 
		 for (int i=0;i <a.size();i++) {
			 System.out.println(a.get(i));
		 }
		
		
		movie m1 = new movie("engame", 300);
		
		movie m2 = new movie("the chamber of secrets", 161);
		
		movie m3 = new movie("i love comsci", 1010);
		
		ArrayList<movie> movies = new ArrayList<movie>();
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		
		Collections.sort(movies);
		
		for (int i=0; i<movies.size(); i++) {
			System.out.println(movies.get(i));
		}
		 */
		
		Move[] movers = new Move[3]; // array of things that implement the interface Move
		movers[0]= new Fox();
		movers[1]= new Car();
		movers[2]= new IceSkater();
		
		for(int i=0; i<3; i++) {
			movers[i].move();
		}
	}
}
