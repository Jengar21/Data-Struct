public class project {
	public static void main(String[] args) {

		// These are here as a reference, I will use different test cases.
		String[] testCases = {
				"<html>\nThis is my awesome webpage!\n</html>\n",
				"<html>\n<body>\n<b>CS241</b> is awesome!\n</html>\n</body>\n",
				"<p><b>Here is some text!</b>",
				"<p><b><i>Italics and bold!</i>just bold</b></p>",
				"<tag_I_made_up>Professor Carmine!</tag_I_made_up>"
		};
		for (String test : testCases) {
			System.out.println(parse(test));
		} 

	}

	public static boolean parse(String html) {
		Stack stack = new Stack();
		int start=0;

		while(true) {
			int p = html.indexOf("<", start);
			if (p < 0) {
				break;
			}

			int p2 = html.indexOf(">", p+1);
			start = p2+1;

			String tag = html.substring(p+1,p2);
			System.out.println(tag);

			if (tag.startsWith("/")) {
				String closingTag = tag.substring(1);
				Node node = stack.pop();
				if (node == null || !node.data.equalsIgnoreCase(closingTag)) {
					return false;
				}
			} else {
				stack.push(new Node(tag));
			}
		}

		return stack.isEmpty();
	}

	public static class Stack{
		Node head;

		public Stack() {
			head = null;
		}

		public boolean isEmpty() {
			return head == null;
		}

		public void push(String data) {
			Node n = new Node(data);
			if(isEmpty()) {
				head = n;
			} else {
				n.next = head;
				head= n;
			}
		}

		public String pop() {
			if(isEmpty()) {
				return null;
			}

			Node n = head;
			head= head.next;

	}

	public static class Node {
		String data;
		Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;
		}
	}
	}}
