package basicPrograms;

import java.util.Collections;
import java.util.TreeSet;
public class GreaterAmong3Number {

	public static void main(String[] args) {
		int a=10;
		int b=30;
		int c=15;
		
		int bigNumber=a>b&&a>c?a:b>c?b:c;
		System.out.println(bigNumber);
		
		
		//using collections class static method max() interface
	TreeSet ts=	new TreeSet();
	ts.add(55);
	ts.add(62);
	ts.add(99);
	ts.add(123);
	
	System.out.println(Collections.max(ts));
	}

}
