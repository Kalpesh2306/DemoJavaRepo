package set;

import java.util.TreeSet;

public class T6 {

	public static void main(String[] args) {
		TreeSet obj=new TreeSet();
		obj.add(1);
		obj.add(5);
		obj.add(6);
		obj.add(9);
		System.out.println(obj);
		//contains(obj) it tell whether the obj is preset in ArrayList or not.
		System.out.println(obj.contains(1));
		System.out.println(obj.contains(10));
	}

}
