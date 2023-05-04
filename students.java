
public class students extends user{
	public String major;
	
	public student(String name, String major) {
	
		super(name);
		this.major =  major;
		
	}
	
	public String toString() {
		return "Amazing student named" + this.name;
	}

}
