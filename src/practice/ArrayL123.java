package practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayL123 {

	public static void main(String[] args) {
		
ArrayList al=new ArrayList();
System.out.println(al.isEmpty());
al.add(10);
al.add(5);
al.add(8);
al.add(9);
al.add(3);
System.out.println("---------------------accessing object at index----------------------");
System.out.println(al.get(3));

System.out.println(al);
System.out.println("---------------------adding at index----------------------");
al.add(3,11);
System.out.println(al);

System.out.println("---------------------removing object  at index----------------------");
al.remove(2);
System.out.println(al);

System.out.println("---------------------removing all objects----------------------");

//al.removeAll(al);
System.out.println(al);


System.out.println("---------------------adding object at perticular position----------------------");
al.set(4, 12);
System.out.println(al);

System.out.println("---------------------Arraylist 2----------------------");

ArrayList al2=new ArrayList();
al2.add(99);
al2.add(67);
al2.add(45);
al2.add(10);
al2.add(5);
al2.add(8);

System.out.println(al2);

System.out.println("---------------------adding one array List to another arraylist----------------------");
al2.addAll(al);

System.out.println(al2);
System.out.println(al);

/*
System.out.println("---------------------remove all---------------------");
al2.removeAll(al);
System.out.println(al2);
System.out.println(al);
*/


System.out.println(al2.indexOf(45));

System.out.println("---------------------retain all---------------------");
al2.retainAll(al);
System.out.println(al2);
System.out.println(al);

System.out.println(al2.lastIndexOf(al2));


System.out.println(al2.size());


Collections.sort(al);;

System.out.println(al);

Collections.reverse(al);

System.out.println(al);


for(int i =0;i<al.size();i++)
{
	System.out.println("at "+ i + " index object  is  "+al.get(i));
	
}
	}

	
		
	}
	
