package practice2;

public class NonStaticMethod2 {

	
	int a=10;
	int b=20;
	{
		System.out.println("non static block");
	}
	public void text()
	{
		System.out.println("text () method");
	}
	public static void main(String[] args) {
	System.out.println("main method");
	NonStaticMethod2 obj=new NonStaticMethod2();
	System.out.println(obj.a);
	obj.text();
	System.out.println(obj.b);

	NonStaticMethod2 obj2=new NonStaticMethod2();
	}

}
