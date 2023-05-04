import java.util.*;

public class weapons implements Comparable<weapons> {
	
	public String name;
	public int damage;
	
	public weapons(String name) {
		this.name= name;
	}
	@Override
	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		weapons sword = new weapons("Sword");
		System.out.println(sword);

	}
	
	public int comapreTo(weapons other) {
		int x = name.compareTo(other.name);
		if (x==0) {
			if (damage<other.damage)return-1;
			if(damage>other.damage)return 1;
			return 0;
		}
		else {
			return x;
		}
	}
	@Override
	public int compareTo(weapons o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
