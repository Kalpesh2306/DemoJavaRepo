package List;

import java.util.ArrayList;

public class A4 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(5);
		obj.add(6);
		obj.add(9);
		System.out.println(obj);
		ArrayList obj1=new ArrayList();
		
		obj1.add(10);
		obj1.add(3);
		obj1.add(4);
		
		obj.addAll(obj1); //addAll() used to add two objects.
		System.out.println("1st Updated list :" +obj);
		System.out.println("2nd Updated list :" +obj1);
		System.out.println("-----------------------------------------------------");
		
		obj1.addAll(obj);
		System.out.println("1st Updated list :" +obj);
		System.out.println("2nd Updated list :" +obj1);
		

	}

}
