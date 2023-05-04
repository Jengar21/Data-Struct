
 class pair<K,V> {
	K key;
	V value;
	
	public void set (K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public void print() {
		System.out.println(key + " "+ value);
	}

}
