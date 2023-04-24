package set;

import java.util.HashSet;

public class H2 {

	public static void main(String[] args) {
		HashSet obj=new HashSet();
		obj.add(1);
		obj.add(5);
		obj.add(6);
		obj.add(9);
		
		System.out.println(obj);
		obj.add(3);//add(object) it will sort the set automatically .don't have to declare the index.
		System.out.println(obj);

	}

}
