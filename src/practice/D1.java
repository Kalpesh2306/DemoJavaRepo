package practice;

public class D1  implements B12,C12
{

	public void test()
	{
		System.out.println("Implmentation of interface A - test()");
			
	}
	public void test1()
	{
		System.out.println("Implementation of interface B - test1()");
		
	}
	public static void main(String[] args) {
		D1 d=new D1();
		d.test();
		d.test1();
		
		// upcasting from class to interface 
		System.out.println("-----------------------------------");
		B12 b=d;
		b.test();
	//downcasting from interface to class.
		System.out.println("-----------------------------------");
		D1 d2=(D1)b;
		d2.test1();d2.test();
		System.out.println("-----------------------------------");
		//upcasting from class to interface C12
		C12 c=d;
		c.test1();
		System.out.println("-----------------------------------");
		//downcasting from interface C12 to class
		
		D1 d3=(D1)c;
		d3.test();
		d3.test1();
		System.out.println("-----------------------------------");
		
		//explicitly type cast the interface reference to 
		C12 c2=(C12)b;
		c2.test1();
		
		B12 b3=(B12)c;
		b3.test();
		
		
		
		
		
		

	}

}
