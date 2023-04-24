package set;

import java.util.HashSet;

public class H10 {

	public static void main(String[] args) {
		HashSet obj=new HashSet();
		obj.add(1);
		obj.add(5);
		obj.add(6);
		obj.add(9);
		System.out.println(obj);
		
		HashSet obj1=new HashSet();
		obj1.add(10);
		obj1.add(5);
		obj1.add(11);
		obj1.add(12);
		System.out.println(obj1);
		
		//retainAll() :this will compare one Set with another Set  and remove the object which are not common.
	obj.retainAll(obj1);
		
	System.out.println("Set after opeation");
	System.out.println(obj);
	System.out.println(obj1);

	}

}
