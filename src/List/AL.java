 package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList(7);
		al.add(10);
		al.add("asadad");
		al.add(50);
		al.add('A');
		al.add(60);
		al.add(70);
		al.add(50);
		al.add(50);
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
	System.out.println(al.isEmpty());
	System.out.println(al.contains(50));
	System.out.println(al.indexOf(70));  
	System.out.println(al.lastIndexOf(50));
	System.out.println(al.get(1));
	al.remove(5);
	System.out.println(al);
	al.add(5,600);
	System.out.println(al);
	
	System.out.println(al);

	al.set(9, "kalpesh");
	System.out.println(al);
	
	System.out.println("-------------------------------Arraylist using iterator-------------------------------------");
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		
	System.out.println("-------------------------------Arraylist using Listiterator-------------------------------------");
ListIterator Li=al.listIterator();
while(Li.hasNext()) 
{
	System.out.println(Li.next());
}
System.out.println("-------------------------------Arraylist using for loop-------------------------------------");
for (int i =0;i<al.size()-1;i++) {
	
	System.out.println(al.get(i));
}
}
	}

