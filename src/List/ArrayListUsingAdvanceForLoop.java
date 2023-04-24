package List;

import java.util.ArrayList;

public class ArrayListUsingAdvanceForLoop {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add('a');
		al.add('c');
		al.add('b');
		al.add('e');
		al.add('d');
		for(Object v:al)
		{
		System.out.println(v);
		}

	}

}
