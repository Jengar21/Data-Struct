
/*
  Your Name:  Jennifer Garcia 
  Pace Email: jg34071n@pace.edu
  Given your implementation, what is the runtime of:
  find and why?
  count and why?
*/
class main {
  public static void main(String[] args) {
    StudentTree st = new StudentTree();
    st.insert("Carmine Guida");
    st.insert("Judd Nelson");
    st.insert("Emilio Estevez");
    st.insert("Ally Sheedy");
    st.insert("Molly Ringwald");
    st.insert("Anthony Michael Hall");
    Student s1 = st.find("Ally Sheedy");
    Student s2 = st.find("Harry Potter");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println("\nCount: " + st.count());
    System.out.println("\nPrint in order:");
    st.print();
    System.out.println("\nPrint in pre-order:");
    st.printPreOrder();
  }
}