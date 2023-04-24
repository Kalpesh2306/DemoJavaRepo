package List;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListReverseMethod {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add('a');
		al.add('c');
		al.add('b');
		al.add('e');
		al.add(1);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
Collections.reverse(al);
System.out.println(al);


	}

}
