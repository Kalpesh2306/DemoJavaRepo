package practice2;

public class MethodOverloading {

	
	public static void dance(String name)
	{
		System.out.println(name + " is singing since last 10 years");
		dance('A');
	}
	public static void dance(char grade)
	{
		System.out.println("he got "+grade+ " grade in Singing" );
		
	}
	public static void main(String[] args) {
		
		dance("rameshwar");
		
		

	}

}
