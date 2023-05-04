import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		office office = new office("161", 266);
		
		Prof carmine = new Prof ("Camrime", office);
		//System.out.println(carmine);
		
		student s = new student ("lune", "Spell");
		//System.out.println(s);
		
		Course cs241= new Course ("CS", 241, "data alg");
		cs241.prof= carmine;
		
		Course cs122= new Course ("CS", 112, "Object program");
		cs122.prof= carmine;
		
		System.out.println(carmine);
		System.out.println(cs241.prof);
		System.out.println(cs122.prof);
		
		System.out.println(cs241.prof.name);
		
		System.out.println(cs241.prof.office.address);

	}

}
