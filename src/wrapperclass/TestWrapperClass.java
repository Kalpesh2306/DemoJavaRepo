package wrapperclass;

public class TestWrapperClass {

	public static void main(String[] args) {
		
		System.out.println("=========================Integer object to int==================");
		Integer a=10;
		int b=a.intValue();
		System.out.println(a);
		System.out.println(b);
		
		Integer c=50;
		int d=c;
				
		System.out.println(c);
		System.out.println(d);
		System.out.println("=========================Byte object to byte==================");
		
		Byte q=50;
		byte w=q.byteValue();
		
		
	System.out.println(q);
	System.out.println(w);
	
	System.out.println("=========================Character object to char==================");
	
	Character e='R';
char r	=e.charValue();
	
System.out.println(e);
System.out.println(r);
Character t='Z';
char y=t.charValue();
System.out.println(t);
System.out.println(y);


	
	
	}
	

}
