
public class Prof extends user {
	
	public office office;
	
	public Prof( String name, office office) {
		
		super(name);
		this.office = office;
	}
	
	public String toString() {
		return "Prof " + this.name;
	}

}
