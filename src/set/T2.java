package set;


import java.util.TreeSet;

public class T2 {

	public static void main(String[] args) {
		TreeSet obj=new TreeSet();
		obj.add(1);
		obj.add(5);
		obj.add(6);
		obj.add(9);
		
		System.out.println(obj);
		obj.add(3);//add(object) it will sort the set automatically .don't have to declare the index.
		System.out.println(obj);

	}

}
