
public class main13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisjointSets ds = new DisjointSets(8);
		
		/*
		ds.union(1, 2);
		ds.union(6, 7);
		System.out.println(ds.find(3));
		System.out.println(ds.find(1));
		
		ds.union(6, 1);
		System.out.println(ds.find(7));
		*/
		
		
		
		ds.print();
		
		ds.unionSize(0, 2);
		ds.print();
		
		ds.unionSize(3, 2);
		ds.print();
		
		ds.unionSize(6, 7);
		ds.print();
		
		ds.unionSize(0, 7);
		ds.print();
	}
	

}
