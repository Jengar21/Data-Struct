
public class edge2 implements Comparable<edge2> {
  int v;  // one end point
  int w;  // the other end
  int weight; // cost

  public edge2(int v, int w, int weight) {
    this.v = v;
    this.w = w;
    this.weight = weight;
  }

  public int compareTo(edge2 other) {
    return Integer.compare(this.weight, other.weight);
  }

  public String toString() {
    return (char)(v + 65) + " " + (char)(w + 65) + ": " + weight;
  }
}