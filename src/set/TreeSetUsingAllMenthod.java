package set;

import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;
public class TreeSetUsingAllMenthod {

	public static void main(String[] args) {
		
	TreeSet ts=new TreeSet();

	ts.add(1);
	ts.add(4);
	ts.add(3);
	ts.add(5);
	ts.add(6);
	ts.add(5);

	
	System.out.println(ts);
	
	ts.add(2);
	ts.add(7);
ts.add(0);
	System.out.println(ts);
	
	
	/*
ts.remove(5);
System.out.println(ts);
System.out.println("===================================new object=======================");
TreeSet ts1=new TreeSet();
ts1.add(8);
ts1.add(11);
ts1.add(13);
ts1.add(4);
ts1.add(10);
ts1.add(9);
System.out.println(ts1);
System.out.println("===================================add all=======================");
ts.addAll(ts1);
System.out.println(ts);
System.out.println(ts1);
ts.removeAll(ts1);
System.out.println("===================================remove object=======================");
System.out.println(ts);
System.out.println(ts1);

System.out.println(ts.isEmpty());
System.out.println(ts1.isEmpty());
System.out.println(ts.contains(4));
System.out.println(ts1.contains(8));
System.out.println(ts.size());
System.out.println("=========================================retainAll=========================");
ts.retainAll(ts1);
System.out.println(ts);
System.out.println(ts1);

Iterator its=ts.iterator();
while(its.hasNext())
{
	System.out.println(its.next());
}
Iterator its1=ts1.iterator();
while(its1.hasNext())
{
	System.out.println(its1.next());
}

*/
	
}

}
