package Inheritance;

public class A11 extends A10 {

	
	public static void test()
	{
		System.out.println("this is child class method");
	}
	public static void main(String[] args) {
		A11 obj=new A11();
		obj.test();
		A10 obj1=obj;
		obj1.test();
		
		
	}

}
