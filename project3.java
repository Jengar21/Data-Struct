
/*
Your Name:  Jennifer Garcia
Pace Email: jg34071n@pace.edu
Is parse an online algorithm? Why or why not?
Given N tags. What is the runtime of parse? Why?

Parse is an online algorithm because it processes the input piece by piece, it does not need to read/access the entire input, it goes 
per iteration element and processes it to see if there's a solution without looking at future elements.  
The run time of N tags would be constant because it is checking each element one by one, O(1).
 */

public class project3 {
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
		int start=0;
		Stack stack= new Stack();
		while(true) {
			int p = html.indexOf("<", start);
			if (p < 0) {
				break;
			}//check if p<0

			int p2 = html.indexOf(">", p+1);
			if (p2 < 0) {
				break;
			}
			start = p2+1;

			String tag =html.substring(p+1,p2);

			//System.out.println(tag);

			if (tag.startsWith("/")) {
				if (html.isEmpty()) {
					stack.push(tag);
					return false;	

					//is the first character '/'
				}
				else {
					tag=tag.substring(1);
					if(stack.isEmpty()) return false;
					String startTag= stack.pop();
					if(!tag.equalsIgnoreCase(startTag))return false;
				}
				//System.out.println(tag);
			}
			System.out.println(tag);
		}
		return stack.isEmpty();
	}

	class Stack{
		Node head;

		public Stack() {
			head = null;

		}

		public boolean isEmpty() {
			if(head== null)return true;
			return false;
		}

		public void push(String n) {
			if(isEmpty()) {
				Node n= head;
				head = next;
				return;
			}

			data.next = head;
			head= next;
		}

		public String pop() {
			if(isEmpty()) return null;

			Node n = head;
			String result = head.data;
			head= head.next;
			return result;
		}

	}

	class Node {
		String data;
		Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

}



