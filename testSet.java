import java.util.Scanner;

public class testSet{

	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);

		//an empty set A of integers
		Set<Integer> A = new Set<Integer>();

		int number;
		int n=0;

		//some integers and add them from A using add()
		for(n=0; n<5;n++){

			System.out.print("Please Enter An Integer ");
			number = scan.nextInt();
			A.add(number);
		}
		//display the set using toString()
		System.out.println("Set Display : " + A.toString());

		//some integers and remove them from A using remove()
		for(int num=0;num<3;num++)

		{
			System.out.print("Please Enter An Integer ");
			number = scan.nextInt();
			A.remove(number);
			

		}
		//display the set using toString()
		System.out.println("Set Display : " + A.toString());

		//check whether it is in A or not using membership() and display the result
		number=scan.nextInt();

		if( A.membership(number))
			System.out.print("Number is in the Set A");
		else 
			System.out.print(false);

	}
}