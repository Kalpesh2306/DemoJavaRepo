package programming;

public class B extends A {

	public static void demo()
	{
		System.out.println("B demo()");
		
	}
	public static void main(String[] args) {
	
	B b=new B();
	b.demo();
	
	A a=b;
	a.demo();
	
	}

}
