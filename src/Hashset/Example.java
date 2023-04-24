package Hashset;

import java.util.HashSet;

public class Example {

	public static void main(String[] args) {
		
	HashSet hs=new HashSet();
	System.out.println(hs);
	System.out.println(hs.isEmpty());
	hs.add(10);
	hs.add("bjkdkj");
	hs.add('c');
	hs.add(0.1);
	hs.add(false);
	System.out.println(hs);
	hs.add(null);
	hs.add(null);
	System.out.println(hs);
	System.out.println(hs.size());
	
	System.out.println(hs.contains('c'));
	HashSet obj=new HashSet();
	System.out.println(hs);
	obj.add(88);
	obj.add(99);
	obj.add('d');
	hs.addAll(obj);
	System.out.println(obj);
	System.out.println(hs);
	
	}

}
