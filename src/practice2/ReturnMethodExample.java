package practice2;

public class ReturnMethodExample {

	
	public static int add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		return 500;
	}
	public static void main(String[] args) {


		System.out.println(add(1,2));
		add(2,3);
		

	}

}
