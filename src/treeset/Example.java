package treeset;

import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		
		TreeSet TS=new TreeSet();
		System.out.println(TS);
		System.out.println(TS.isEmpty());
		TS.add(10);
		TS.add(15);
		TS.add(12);
		TS.add(11);
		TS.add(14);
		TS.add(13);
		System.out.println(TS);
		TreeSet<Character> obj=new TreeSet();
		obj.add('p');
		obj.add('o');
		obj.add('s');
		obj.add('u');
		obj.add('t');
		obj.add('v');
		obj.add('r');
		System.out.println(obj);
		
		System.out.println(obj.size());
		System.out.println(TS.contains(15));
		
		
	}

}
