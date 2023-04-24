package set;

import java.util.TreeSet;

public class T4 {

	public static void main(String[] args) {
		TreeSet obj=new TreeSet();
		obj.add(1);
		obj.add(5);
		obj.add(6);
		obj.add(9);
		System.out.println(obj);
		TreeSet obj1=new TreeSet();
		
		obj1.add(10);
		obj1.add(3);
		obj1.add(4);
		
		obj.addAll(obj1);
		System.out.println("1st Updated list :" +obj);
		System.out.println("2nd Updated list :" +obj1);
		System.out.println("-----------------------------------------------------");
		
		obj1.addAll(obj);
		System.out.println("1st Updated list :" +obj);
		System.out.println("2nd Updated list :" +obj1);
	}

}
