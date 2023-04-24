package List;

import java.util.ArrayList;

public class A8 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(5);
		obj.add(6);
		obj.add(9);
		System.out.println(obj);
		//remove(index) :used to remove the object at index
		obj.remove(1);
		System.out.println(obj);
	}

}
