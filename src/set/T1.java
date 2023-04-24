package set;


import java.util.TreeSet;

public class T1 {

	public static void main(String[] args) {
		TreeSet obj=new TreeSet();
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		
		obj.add(1);
		obj.add(2);
		System.out.println("After addition " + obj);
		System.out.println(obj.isEmpty());

	}

}
