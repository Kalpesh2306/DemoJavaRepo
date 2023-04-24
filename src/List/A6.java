package List;

import java.util.ArrayList;

public class A6 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
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
