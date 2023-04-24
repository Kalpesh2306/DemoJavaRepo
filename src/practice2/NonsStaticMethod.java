package practice2;

public class NonsStaticMethod {
		int a;
		{
			System.out.println("this is non static block");
		}
		public void dance() {
			
			System.out.println("this is non static method");
		}
		NonsStaticMethod()
		{
			System.out.println("this is constructor");
		}
		
	public static void main(String[] args) {
	
		NonsStaticMethod obj=new NonsStaticMethod();
		System.out.println("This is main method");
		System.out.println(obj.a);
		obj.dance();
		
	}

}
