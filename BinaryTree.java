
/*
binary search tree 
everything to the left of you is less than you 
everything to the right of you is greater than you 
find, findMin, findMax, insert, remove O(logn)
 assuming the tree is balance till be log(n) time 
 in post order the root is last, in pre order the root is first, in order the root is in the middle
 pre order: node, left, right
 in order: left, node, right
 post order: left,right,node
 */
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {
	NodeBS root;

	public BinaryTree() {
		this.root=null;
	}

	public void insert(NodeBS n) {
		// is it empty?
		if(root==null){
			root=n;
			return;
		}

		NodeBS current = root;
		while(true) {
			//should we go left?
			if(n.data<= current.data) {
				// yes..but those it end there?
				if(current.left==null) {
					current.left = n;
					return;
				}
				current=current.left;
			}
			// go right
			else {
				// if the right a dead end?
				if(current.right==null) {
					current.right = n;
					return;
				}
				current=current.right;
			}
		}
	}
	public NodeBS find( int search) {
		return find(root,search);
	}
	
	public NodeBS find(NodeBS n, int search) {
		if(n==null)return null;
		if(n.data==search)return n;
		if(search < n.data) { 
			return find(n.left,search);
		}else {
			return find(n.right,search);
		}
	}
	public NodeBS findMin() {
		if(root ==null)return null;
		return findMin(root);
	}
	
	public NodeBS findMin(NodeBS n) {
		if(n.left == null)return n;
		return findMin(n.left);
	}
	
	public NodeBS findMax() {
		if(root==null) return null;
		return findMax(root);
	}
	
	public NodeBS findMax(NodeBS n){
		if(n.right == null)return n;
		return findMax(n.right);
	}
	
	//Print in order
	public void printInOrder() {
		printInOrder(root);
	}
	public void printInOrder(NodeBS n) {
		if(n==null)return;
		printInOrder(n.left);
		System.out.println(n.data);
		printInOrder(n.right);
	}
	public void printPreOrder() {
		printPreOrder(root);
	}
	public void printPreOrder(NodeBS n) {
		if(n==null)return;
		printPreOrder(n.left);
		printPreOrder(n.right);
		System.out.println(n.data);
	}
	
	public void printPostOrder() {
		printPostOrder(root);
	}
	public void printPostOrder(NodeBS n) {
		if(n==null)return;
		printPreOrder(n.left);
		printPostOrder(n.right);
		System.out.println(n.data);
	}
	
	
	
	public void remove(int search) {
		NodeBS n = new NodeBS(search);
		this.root=remove(this.root, n);
	}
	
	public NodeBS remove(NodeBS current, NodeBS n) {
		if(current ==null) return null;
		if(n.data < current.data) {
			current.left = remove(current.left, n);
		}
		else if (n.data > current.data) {
			current.right = remove(current.right,n);
		}else {
			//we found it 
			// does it have two children?
			if (current.left != null && current.right!=null) {
				NodeBS min = findMin(current.right);
				current.data= min.data;
				current.right = remove(current.right,min);
			}
			else if(current.left!=null) {
				current = current.left;
			}
			else {
				current = current.right;
			}
		}
		return current;
	}
	
	public void printBreadthFirst() {
		if(this.root == null) return ;
		
		Queue<NodeBS> q = new LinkedList<NodeBS>();
		q.add(this.root);
		
		while(!q.isEmpty()) {
			NodeBS n = q.remove();
			System.out.println(n.data);
			
			if(n.left !=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
		}
	}
}
