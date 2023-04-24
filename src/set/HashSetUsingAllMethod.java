package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUsingAllMethod {

	public static void main(String[] args) {
	HashSet	obj=new HashSet ();
	System.out.println(obj);
	obj.add(10);
	obj.add("qdeadswqdq");
	obj.add(20);
	obj.add(4);
	obj.add(5);
	obj.add('A');
	obj.add(5);
	obj.add(4);
	obj.add(null);
	obj.add(null);
	System.out.println(obj.contains(20));
System.out.println(obj.isEmpty());
	System.out.println(obj);
	System.out.println(obj.size());
	obj.remove(5);
	System.out.println(obj);
	System.out.println("================================== ======================================================");
	HashSet	obj1=new HashSet ();
	obj1.add(88);
	obj1.add(74);
	obj1.add(4);
	obj1.add(20);
	obj1.add('A');
	System.out.println(obj1);
	System.out.println("================================== add ALL======================================================");
	obj.addAll(obj1);
	System.out.println(obj);
	System.out.println(obj1);
	System.out.println("=============================RemoveAll ======================================================");
	/*obj.removeAll(obj1);
	System.out.println(obj);
	System.out.println(obj1);
	*/
	System.out.println("=============================RetainAll ======================================================");
	
	obj.retainAll(obj1);
	System.out.println(obj);
	System.out.println(obj1);
	
	}
}
