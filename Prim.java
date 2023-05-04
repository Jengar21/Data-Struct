import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prim {
  public void mst(Graph g) {
    ArrayList<edge2> solution = new ArrayList<edge2>();
    PriorityQueue<edge2> pq = new PriorityQueue<edge2>();
  
    boolean[] visited = new boolean[g.vertices.length];
    for (int i = 0; i < visited.length; i++) {
      visited[i] = false;
    }
  
    pq.addAll(g.vertices[0].e); // add all edges from firt stop
    visited[0] = true;
  
    while (!pq.isEmpty()) {
    	edge2 e = pq.poll(); // take out an edge
      if (visited[e.w]) continue; // visited other end? bail out
  
      solution.add(e);
      pq.addAll(g.vertices[e.w].e);
      visited[e.w] = true;
    }

    for (edge2 e : solution) {
      System.out.println(e);
    }
  }
}
