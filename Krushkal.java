import java.util.ArrayList;
import java.util.PriorityQueue;

public class Krushkal {

  public void mst(Graph2 g) {
    PriorityQueue<edge3 > pq = new PriorityQueue<edge3 >(g.e);
    ArrayList<edge3 > solution = new ArrayList<edge3 >();

    // Store disjoint sets
    int[] sets = new int[g.vertexCount];
    for (int i = 0; i < g.vertexCount; i++) {
      sets[i] = -1;
    }

    while (!pq.isEmpty()) {
      edge3 e = pq.poll(); // remove/delete

      int rootv = find(sets, e.v);
      int rootw = find(sets, e.w);

      if (rootv == rootw) continue;
      union(sets, e.v, e.w);
      solution.add(e);
    }

    for (edge3  e : solution) {
      System.out.println(e);
    }

  }

  // Find x in the sets (from disjoint set lesson)
  int find(int[] sets, int x) {
    if (sets[x] < 0) return x;
    return find(sets, sets[x]);
  }

  void union(int[] sets, int x, int y) {
    int rootx = find(sets, x);
    int rooty = find(sets, y);
    sets[rootx] = rooty;
  }
  
}