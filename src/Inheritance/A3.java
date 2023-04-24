package Inheritance;

public class A3 {

	int a=10;
	int b=20;
	
	{
		System.out.println("non static block of parent class");
		
	}
	public void test1()
	{
		System.out.println("non static method of parent class");
	}
	
	A3()
	{
		System.out.println("Constructor of parent class");
	}
}
