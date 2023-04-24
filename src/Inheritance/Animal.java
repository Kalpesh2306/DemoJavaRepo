package Inheritance;

public class Animal {

	public void ani()
	{
		System.out.println("i am blong to animal family.");
	}
	public static void main(String[] args) {
	Animal obj=	new Animal();
	obj.ani();
Dog d=(Dog)obj;


	}

}
