
public  class Courses implements Comparable<Courses> {
	public String dep;
	public int cNum;
	public String cName;

	public Courses(String dep, int cNum, String cName) {
		this.dep = dep;
		this.cNum = cNum;
		this.cName = cName;
	}

	public int compareTo(Courses o) {
		// department comparison
		if (dep.compareTo(o.dep) == 0) // if equal return 0
		{
			int result = Integer.compare(cNum, o.cNum);
			return result;
			// compare the numbers
		} 
		//else 
		//{
		//dep.compareTo(o.dep);
		//o.dep.compareTo(dep);
		//use compareTo to see if dep comes before other.dep or after
		//}
		return dep.compareTo(o.dep);
	}

	public String toString() {
		return dep + " " + cNum + ": " + cName;
	}
}
