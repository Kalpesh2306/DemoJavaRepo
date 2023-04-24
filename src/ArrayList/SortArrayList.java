package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		
		obj.add(8);
		obj.add(5);
		obj.add(4);
		obj.add(7);
		obj.add(6);
		System.out.println(obj);
		Collections.sort(obj);;
		System.out.println(obj);

	}

}
