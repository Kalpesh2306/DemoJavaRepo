package Interface;

public class E implements A,B {

	public void test()
	{
		System.out.println("this is implemtation method of interface A");
		
	}
	public void test1()
	{
		System.out.println("this is implementation method of interface B ");
		
	}
	public static void main(String[] args) {
		System.out.println("-------------Upccasting from class E to interface A--------------------");
	A a	=new E();
	a.test();
	//once we upcaste the refence from child to parent then we can no access the member of child class with reference of parent.
	
	//to access the member of child class with parent class reference  we have downcast the reference from parent to child and this is not done implicitly.
	//complie has to do the explicitly.
	
	System.out.println("-------------Downcasting from interface A to class E--------------------");
	
	E e=(E)a;
	e.test1();
	e.test();
	
	System.out.println("-------------Upcasting form class E to interface B--------------------");
	
	B b=new E();
	b.test1();
	System.out.println("-------------Downcasting from interface  B to class E--------------------");
	
	E e1=(E)b;

	e1.test();
	e1.test1();
	System.out.println("-------------Typecast  from interface A to Interface B -------------------");
	
	//to access the method of interface b.
	//but before this we have to create the object o class which is implementing this interface and the upcast the refence to reference of intereface the typecast to another interface.
	
B b1=(B)a;
b1.test1();



	
	
	
	

		
		

	}

}
