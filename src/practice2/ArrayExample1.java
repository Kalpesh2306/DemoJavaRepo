package practice2;

public class ArrayExample1 {

	
	public static void main(String[] args)
	{
		int a[]=new int [3];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		a[0]=10;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		a[1]=20;
		a[2]=30;
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println(a.length);
		
		String b[]=new String [3];
		
		System.out.println(b[0]);
		boolean c[]=new boolean[2];
		System.out.println(c[0]);
		
		float f[]=new float[4];
		System.out.println(f[0]);
		
		
		
	}
}
