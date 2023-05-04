/*
 *  Your Name:  Jennifer Garcia
 *  Pace Email: jg34071n@pace.edu
 *  Based on your implementation, what is the big O for the following methods: insert(): O(logn) delete():O(logn) isEmpty(): O(1)
 *  Based on your implementation, what is the big O for combine() and why?: O(n log n) because it calls the insert method which is logn.
 *  Based on your implementation, what is the big O for purge() and why?: The big O of this implementation is O(nlogn), because it calls the delete method which is logn
 */
public class project6 {


	public static void main(String[] args) {
		// These are just some examples, be sure to test everything!
		PizzaQueue pq = new PizzaQueue(5);
		pq.insert(new Pizza(10, "Pepperoni Pizza"));
		pq.insert(new Pizza(5, "Mushroom Pizza"));
		pq.insert(new Pizza(100, "Super Duper Pizza"));

		pq.insert(new Pizza(25, "Chicken Pizza"));
		pq.debug();
		System.out.println(pq.delete());
		System.out.println();
		pq.debug();
		PizzaQueue paceEvent = new PizzaQueue(5);
		paceEvent.insert(new Pizza(1, "Plain Pizza"));
		paceEvent.insert(new Pizza(12, "Sausage Pizza"));
		paceEvent.insert(new Pizza(3, "Salad Pizza"));
		paceEvent.debug();
		pq.combine(paceEvent);
		Pizza[] finalList = pq.purge();
		for (Pizza p : finalList) {
			System.out.println(p);
		} }
}



