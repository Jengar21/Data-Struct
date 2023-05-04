public class memoryCell < T > {

	// data fields
	private T mydata;

	// constructors
	// default constructor only

	// methods
	public T read( ){  return mydata;  }
	public void write( T newdata ){ this.mydata = newdata; }
	public String toString( ){ return mydata.toString(); }

	//test method
	public static void main(String[ ] args){

		memoryCell<Integer> myfirstmc  = new memoryCell< Integer >( );
		memoryCell<String> mysecondmc = new memoryCell< String >( );
		memoryCell< memoryCell <Integer> > mythirdmc = new memoryCell< memoryCell <Integer> > ();

		myfirstmc.write(100);
		mysecondmc.write("John");
		mythirdmc.write(myfirstmc);
		int content = myfirstmc.read();
		System.out.println(content);
		System.out.println(myfirstmc.toString());
		System.out.println(mysecondmc.toString());
		System.out.println(mythirdmc.toString());

	}


}
