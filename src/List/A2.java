package List;

import java.util.ArrayList;

public class A2 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
				
		obj.add(1);
		obj.add(5);
		obj.add(6);
		obj.add(9);
		
		System.out.println(obj);
		obj.add(2,3);//add(index,value)
		System.out.println(obj);
		
	}

}
