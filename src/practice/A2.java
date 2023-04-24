package practice;

public class A2 {
	int a =10;
	int b=20;
	A2(int a)
	{
		System.out.println("parametrised constructor");

	}
	{
		
		System.out.println("non static block");
	}
	public void text()
	{
		System.out.println("text() method");
	}
	A2()
	{
		System.out.println("this is default constructor");
	}

	public static void main(String[] args) {

		A2 obj=new A2();
		System.out.println(obj);
	}

}
