package List;

import java.util.ArrayList;

public class A9 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(5);
		obj.add(6);
		obj.add(9);
		System.out.println(obj);
		
		ArrayList obj1=new ArrayList();
		obj1.add(10);
		obj1.add(5);
		obj1.add(11);
		System.out.println(obj1);
		
		//removeAll() :it will compare one arraylist with another array list and remove duplicate objects.
		obj.removeAll(obj1);
		
	System.out.println("Array list after opeation");
	System.out.println(obj);
	System.out.println(obj1);
	
	}
}
