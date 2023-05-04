import java.util.PriorityQueue;

public class Vertex {
  PriorityQueue<edge2> e;

  public Vertex() {
    e = new PriorityQueue<edge2>();
  }

  public void addedge2(edge2 edge) {
    e.add(edge);
  }
  
}