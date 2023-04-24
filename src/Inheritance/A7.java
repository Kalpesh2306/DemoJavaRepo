package Inheritance;

public class A7 {

	
	A7(int a)
	{
		System.out.println("A(int)");
	}
	A7(char c)
	{
		this(1);
		System.out.println("A(char)");
	}
	A7(String s)
	{
		this('a');
		System.out.println("A(String )");
	}
	A7()
	{
		this("hello");
		System.out.println("Default constructor");
	}
	public static void main(String[] args) {
		A7 obj=new A7();
	}

}
