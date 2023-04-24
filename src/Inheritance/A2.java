package Inheritance;

public class A2  extends A1{

	static int c=30;
	static int d=40;
	
	static 
	{
		System.out.println("static block of child class");
	}
	
	public static void tes1()
	{
		
		System.out.println("static method of child class");
	}
	public static void main(String[] args) {
		
		
	System.out.println("main method");

	}

}
