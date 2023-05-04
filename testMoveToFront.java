import java.util.*;

public class testMoveToFront {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);

		MoveToFront<Integer> A = new MoveToFront<Integer>();

		int number=0;

		for (int num=0; num<5; num++)
		{
			System.out.print("Please Enter An Integer ");
			number = scan.nextInt();
			A.push(number);
		}
		System.out.println(A);
		
		// checking that repetitions are removed
		for (int num=0; num<5; num++)
		{
			A.push(number);
		}

		System.out.println();
		
		//that removes the item added the latest to the collection
		
		A.pop();
		System.out.println(A);
		
		
		System.out.println();

		// checking both outcomes of boolean functions
		System.out.println("Linked List contains 1 : "+A.contains(1));
		System.out.println("Linked List is empty: "+A.isEmpty());

	}

}
