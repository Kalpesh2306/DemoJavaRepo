package set;

import java.util.HashSet;

public class H8 {

	public static void main(String[] args) {
		HashSet obj=new HashSet();
		obj.add(1);
		obj.add(5);
		obj.add(6);
		obj.add(9);
		System.out.println(obj);
		//remove(object) :used to remove the object 
		obj.remove(1);
		System.out.println(obj);
	}

}
