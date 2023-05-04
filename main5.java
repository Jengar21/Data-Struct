import java.util.ArrayList;

public class main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Spider-Man");
		a.add("Iron Man");
		a.add("Batman");
		System.out.println(a);
		
		System.out.println(a.indexOf("Batman"));
		a.set(0, "Ant-man");
		System.out.println(a.get(0));
		
		a.remove(2);
		System.out.println(a);
		*/
		
		weaponList list = new weaponList();
		
		weapons sword = new weapons("Sword");
		weapons staff = new weapons("Staff");
		weapons club = new weapons("Club");
		
		weapons x = new weapons("Sword");
		if(x== sword) {
			System.out.println("They are the same");
		}else {
			System.out.println("They are different");
		}
		
		list.add(sword);
		list.add(staff);
		list.add(club);
		list.print();
		
		//int x= list.indexOf("Staff");
		//System.out.println(list.get(x));
		
		//System.out.println(list.indexOf("Staff"));
		
		
		list.remove("Sword");
		list.add(new weapons("Magic Wand"));
		list.print();

	}

}
