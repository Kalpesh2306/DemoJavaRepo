package practice;

public class M2 extends M1{

	
	public void dance()
	{
		System.out.println("kalpesh is dancing ");
		
	}
	public static void main(String[] args) {
		
		M2 m=new M2();
		m.dance();
		M1 m1=m;
		
		m.dance();
	}

}
