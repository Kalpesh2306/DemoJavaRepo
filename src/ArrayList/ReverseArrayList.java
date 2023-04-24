package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayList {

	public static void main(String[] args) {
		
		
		ArrayList obj=new ArrayList();
		
		obj.add(4);
		obj.add(1);
		obj.add(3);
		obj.add(2);

		System.out.println(obj);
		Collections.reverse(obj);
		System.out.println(obj);
	}

}
