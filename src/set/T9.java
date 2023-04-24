package set;

import java.util.TreeSet;

public class T9 {

	public static void main(String[] args) {
		TreeSet obj=new TreeSet();
		obj.add(1);
		obj.add(5);
		obj.add(6);
		obj.add(9);
		System.out.println(obj);
		
		TreeSet obj1=new TreeSet();
		obj1.add(10);
		obj1.add(5);
		obj1.add(11);
		System.out.println(obj1);
		
		//removeAll() :it will compare one object set  with another object Set and remove duplicate objects.
		obj.removeAll(obj1);
		
	System.out.println("Set  list after opeation");
	System.out.println(obj);
	System.out.println(obj1);
	
	}

}
