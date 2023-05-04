
class item<T> {
	
	T id;
	String name;
	
	public void set (T id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public void print() {
		System.out.println(id + " "+ name);
	}

}
