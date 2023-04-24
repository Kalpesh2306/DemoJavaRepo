package set;


import java.util.HashSet;

public class H1 {

	public static void main(String[] args) {
		HashSet obj=new HashSet();
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		
		obj.add(1);
		obj.add(2);
		System.out.println("After addition " + obj);
		System.out.println(obj.isEmpty());
	}

}
