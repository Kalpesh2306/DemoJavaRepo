package practice2;

public class ConstructorExample {
	int a=10;
	int b=20;
	ConstructorExample(int a)
	{
		System.out.println("Parameterised Constructor");
	}
	
	{
		System.out.println("non-static block");
	}
	public void text()
	{
		
		System.out.println("text () method");
	}

	ConstructorExample()
	{
		System.out.println("this is default Constructor");
	}
	public static void main(String[] args) {
		ConstructorExample obj=new ConstructorExample();
		
		
	
	}

}
