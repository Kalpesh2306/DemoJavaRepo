package List;

import java.util.ArrayList;

public class A1 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		
		obj.add(1);
		obj.add(2);
		System.out.println("After addition " + obj);
		System.out.println(obj.isEmpty());
		

	}


}
