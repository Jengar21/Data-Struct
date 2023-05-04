class  main17 {
	public static void main(String[] args) {

		Graph2 g = new Graph2(7);
		g.addedge3(new edge3(0, 1, 7));
		g.addedge3(new edge3(0, 3, 5));

		g.addedge3(new edge3(1, 2, 8));
		g.addedge3(new edge3(1, 3, 9));
		g.addedge3(new edge3(1, 4, 7));

		g.addedge3(new edge3(2, 4, 5));

		g.addedge3(new edge3(3, 4, 15));
		g.addedge3(new edge3(3, 5, 6));

		g.addedge3(new edge3(4, 5, 8));
		g.addedge3(new edge3(4, 6, 9));

		g.addedge3(new edge3(5, 6, 11));


		Krushkal k = new Krushkal();
		k.mst(g);

	}
}