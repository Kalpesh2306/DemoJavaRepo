package Inheritance;

public class A4 extends A3{

	int c=10;
	int d=20;
	
	{
		System.out.println("non static block of child class");
		
	}
	public void test2()
	{
		System.out.println("non static method of child class");
	}
	
	A4()
	{
		System.out.println("Constructor of child class");
	}
	public static void main(String[] args) {
	
		A4 obj=new A4();
		
	}

}
