package practice2;

public class ConstructorExample2 {
int a;
ConstructorExample2(int a){
	System.out.println(a);
	int b=20;
	System.out.println(this.a);
	this.a=30;
	System.out.println(b);
	System.out.println(this.a);
}
	public static void main(String[] args) {
			
		
		ConstructorExample2 obj=new ConstructorExample2(10);

	}
}
