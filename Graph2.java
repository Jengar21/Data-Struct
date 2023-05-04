import java.util.ArrayList;

public class Graph2 {
	int vertexCount;
	ArrayList<edge3> e;

	public Graph2(int vertexCount) {
		this.vertexCount = vertexCount;
		this.e = new ArrayList<edge3>();
	}

	public void addedge3(edge3 edge) {
		e.add(edge);
	}


}
