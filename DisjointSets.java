/* disjoint set- none of the set have anything in common, order doesn't matter 
 * have only two operation called union and find
 * union- combine, joins sets together
 * find- what set something is in, returns the set something belongs to 
 * application includes- keeps track of connected components
 * - (is the root ) 1 (is the number in the set) is the stopping point or it belongs to itself 
 * union by size -# 
 */
public class DisjointSets {
	int[] a;
	
	public DisjointSets(int size) {
		a = new int[size];
		for(int i=0; i<a.length;i++) {
			a[i]=-1;
		}
	}
	
	public int find(int x) {
		if (a[x]<0) return x;
		return find(a[x]);
	}
	
	public void union(int x, int y) {
		int rootx= find(x);
		int rooty= find(y);
		a[rootx]=rooty;	
	}
	
	public void unionSize(int x, int y) {
		int rootx = find(x);
		int rooty = find(y);
		
		// lower number means more member
		// if rootx has more members 
		if(a[rootx]< a[rooty]) {
			a[rootx]= a[rootx]+ a[rooty];
			a[rooty]= rootx;
		}else {
			a[rooty]= a[rooty]+ a[rootx];
			a[rootx]= rooty;
		}
			
	}
	
	public void print() {
		for(int i = 0; i<a.length; i++) {
			System.out.printf("%3d", a[i]);
			
		}
		System.out.println();
		
		for(int i = 0; i<a.length; i++) {
			System.out.printf("%3d", i);
			
		}
		System.out.println();
		System.out.println();
	}

}
