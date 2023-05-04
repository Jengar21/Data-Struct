
import java.util.Scanner;

public class main6 {


	public static void main(String[] args){
		/*
		LinkedList<String> list= new LinkedList<String>(); {
			list.add("jen");
			list.add("cindy");
			list.add("brian");

			System.out.println(list);

			list.remove("jen");
			System.out.println(list);

			list.remove(1);
			System.out.println(list);

			list.removeFirst();
			System.out.println(list);
			}
		 */
		Scanner scan = new Scanner(System.in);

		LinkedList list= new LinkedList();

		list.addFront(new N("Kind"));
		list.addFront(new N("Sugar"));
		list.addFront(new N("Tea"));
		list.print();

		System.out.println("what are you looking for?");
		String search = scan.nextLine();

		N n= list.find(search);
		if(n ==null) {
			System.out.println("not found!");

		}else {
			n.data = "cool";
		}
		list.print();


		System.out.println(list.count());

	}
}