
public class main3 {

	//N^2 doesn't need storage
	public static boolean hasDupes(String s) {
		int n= s.length();

		for(int i=0; i<n;i++) {
			char c =s.charAt(i);
			for(int j=i+1;j<n;j++) {
				if(c== s.charAt(j)) return true;

			}
		}
		return false;
	}

	//N tho needs storage 
	public static boolean fastHasDupes(String s) {
		int[] counters= new int[26];

		int n= s.length();

		for(int i=0; i<n;i++) {
			char c =s.charAt(i);
			int x= ((int)c) - 97;
			if (counters[x]==0) {
				counters[x]=1;
			}
			else {return true;}

		}return false;
	}

	public static void main(String[] args) {

		System.out.println(hasDupes("jennifer"));
		System.out.println(hasDupes("car"));
		System.out.println();
		System.out.println(fastHasDupes("jennifer"));
		System.out.println(fastHasDupes("car"));

	}
}
