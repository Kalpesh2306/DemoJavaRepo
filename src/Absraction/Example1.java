package Absraction;

public class Example1 extends Example {
	
	public int sum(int a,int b)
	{
		int c=a+b;
		
	return c;
	}
	public static void main(String[] args) 
	{
	Example1 ex=new Example1();
	Example obj=ex;
	System.out.println(ex.sum(30,40));
	}

}
