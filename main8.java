
public class main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue();
		
		q.enqueue(new NodeQ("fix printer"));
		q.enqueue(new NodeQ("install windows 11"));
		q.enqueue(new NodeQ("reboot server"));
		
		while(!q.isEmpty()) {
			NodeQ n = q.dequeue();
			System.out.println(n.data);
		}

	}

}
