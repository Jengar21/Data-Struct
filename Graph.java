public class Graph {
  Vertex[] vertices;

  public Graph(int v) {
    this.vertices = new Vertex[v];
    for (int i = 0; i < v; i++) {
      this.vertices[i] = new Vertex();
    }
  }

  public void addEdge(edge2 edge) {
    this.vertices[edge.v].addedge2(edge);
    edge2 temp = new edge2(edge.w, edge.v, edge.weight);
    this.vertices[temp.v].addedge2(temp);
  }
}