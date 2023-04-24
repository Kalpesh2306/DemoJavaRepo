package List;

import java.util.ArrayList;

public class ArrayListRemoveAll {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add('a');
		al.add('c');
		al.add('b');
		al.add('e');
		al.add('d');
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.add('f');
		al2.add('g');
		al2.add('a');
		al2.add('h');
		al2.add('i');
		System.out.println(al2);
		System.out.println("----------------------------after addling to arraylist---------------------");
		//al.addAll(al2);
		
		
		
		
		al.removeAll(al2);
		System.out.println(al);
		System.out.println(al2);
		
		al.retainAll(al2);
		
		System.out.println(al);
		System.out.println(al2);
		
	}
	

}
