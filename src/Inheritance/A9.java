package Inheritance;

public class A9 extends A8{
	
	public void demo()
	{
		System.out.println("child is dancing");
	}

	public static void main (String [] args)
	{
		A9 obj=new A9();
		obj.demo();
		A8 obj2=obj;
		obj.demo();
	}
}
