package set;

import java.util.TreeSet;

public class T8 {

	public static void main(String[] args) {
		TreeSet obj=new TreeSet();
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
