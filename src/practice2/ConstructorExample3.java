package practice2;

public class ConstructorExample3 {

	int a=10;
	int b;
	public int demo(int a)
	{
		System.out.println(a);
		int b=30;
		System.out.println(this.a);
		System.out.println(this.b);
		return this.b;
	}
	public void test()
	{
		int res=demo('a');
		System.out.println(this.b);
		this.a=40;
		System.out.println(this.a);
		System.out.println(this.b);
	}
	public static void main(String[] args) 
	{
		ConstructorExample3 obj=new ConstructorExample3();
		obj.test();
	}

}
