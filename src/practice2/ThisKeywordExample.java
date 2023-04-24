package practice2;

public class ThisKeywordExample {

	
	int a;
	{
		a=10;
		System.out.println(a);
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
		
	}
	public static void main(String[] args) {
		
		ThisKeywordExample obj=new ThisKeywordExample();

	}

}
