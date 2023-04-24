package Inheritance;

public class Mango extends Fruit {

	public void eat()
	{
		System.out.println("test is good");
	}
	public static void main(String[] args) {
		
		Mango M=new Mango();
M.grow();
M.eat();
Fruit F=M;
F.grow();

	}

}
