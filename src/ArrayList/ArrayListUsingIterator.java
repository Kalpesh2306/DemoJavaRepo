package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListUsingIterator {

	public static void main(String[] args) {
		
		
		ArrayList obj=new ArrayList();
		obj.add(4);
		obj.add(1);
		obj.add(3);
		obj.add(2);
		System.out.println(obj);
		Iterator it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
	}

}
