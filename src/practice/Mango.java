package practice;

public class Mango extends Fruit {

	public static void eat()
	
	{
		System.out.println("Test is good");
			
	}
	
	public static void main(String[] args) {
		
		Mango M=new Mango();
		M.eat();
		M.grow();
Fruit F=M;
//F.eat();
F.grow();

Mango M1=(Mango)F;
M1.eat();


	}

}
