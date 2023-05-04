public class StudentTree {
	Student root;
	public void insert(String name) {
		Student s = new Student(name);
		if (root == null) {
			root = s;
			return;
		}
		Student current = root;
		while (true) {
			if (s.name.compareTo(current.name) < 0) {
				if (current.left == null) {
					current.left = s;
					return;
				} else {
					current = current.left;
				}
			}
			else {
				if(current.right==null) {
					current.right = s;
					return;
				}
				current=current.right;
				// Add to the right side
				// You need to remove/change/add code here

			} 
		}
	}


	public Student find( String search) {
		return find( search);
	}
	
	public Student find(Student s, String search) {
		if(s==null)return null;
		if(s.name.equals(search))return s;
		if(search.compareTo(s.name) <0) { 
			return find(s.left, search);
		}else {
			return find(s.right,search);
		}
	}
	
	public int count() {
	    if (root == null) return 0;
	    int total = 0;

	    Student current = root;
	    while (current != null) {
	      total++;
	      current = current.left;
	      current = current.right;
	    }
	    return total;
	  }

	public void print() {
		if(root==null)return;

		Student current = root;

		if(current != null) {
			System.out.println(current.name);
		}
	}

	public void printPreOrder() {
		printPreOrder(root);
	}
	public void printPreOrder(Student s) {

		if(s==null)return;
		printPreOrder(s.left);
		printPreOrder(s.right);
		System.out.println(s.name);
	}
}