package List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add(1);
		ll.add(10);
		ll.add(5);
		ll.add(4);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(5));
		System.out.println(ll.indexOf(10));
		System.out.println(ll.get(1));
		System.out.println(ll.lastIndexOf(5));
		ll.add(4,500);
		System.out.println(ll);
		ll.set(3,15);
		System.out.println(ll);
		
		Collections.sort(ll);
	
		System.out.println(ll);
		Collections.reverse(ll);
		System.out.println(ll);
		System.out.println("----------------------fetching list using iterator cusor---------------");
		Iterator li=ll.iterator();
		while (li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("----------------------fetching list using listiterator cusor---------------");
	ListIterator lli=ll.listIterator();
	while(lli.hasNext())
	{
		System.out.println(lli.next());
		
	}
	System.out.println("----------------------fetching list using for loop---------------");

	for (int i=0;i<ll.size()-1;i++)
	{
		System.out.println(ll.get(i));
	}
	System.out.println("----------------------fetching list using for each loop---------------");

	
	for(Object v:ll) {
		System.out.println(v);
		
	}
	}
	

}
