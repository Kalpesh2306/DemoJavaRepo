package set;

import java.util.HashSet;

public class H6 {

	public static void main(String[] args) {
		HashSet obj=new HashSet();
		obj.add(1);
		obj.add(5);
		obj.add(6);
		obj.add(9);
		System.out.println(obj);
		//contains(obj) it tell whether the obj is preset in ArrayList or not.
		System.out.println(obj.contains(2));
		System.out.println(obj.contains(6));
	}

}
