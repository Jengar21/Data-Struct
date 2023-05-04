
 class movie implements Comparable<movie>{
	 public String name;
	 public int min;
	 
	 public movie(String name, int min) {
		 this.name= name;
		 this.min=min;
	 }
	 
	 public int compareTo(movie other) {
		if (min<other.min) return -1;
		if (min>other.min) return 1;
		return 0;
	 }
	 
	 @Override
	 public String toString() {
		 return this.name + "(" + this.min+ ")";
	 }

}
