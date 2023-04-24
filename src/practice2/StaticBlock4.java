package practice2;

public class StaticBlock4 {

	static int a;
	static int b;
	public static void demo()
	{
		int a=30;
		System.out.println("demo()");
		System.out.println(a);
		System.out.println(b);
		System.out.println(StaticBlock4.a);
		System.out.println(b);
	}
	static { 
		a=20;
		System.out.println("Static block");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println(StaticBlock4.a);
		System.out.println(b);
		demo();
				
	}

}
