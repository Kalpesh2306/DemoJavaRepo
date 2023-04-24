package practice;

public class A1 {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,44,44,55,9,8,2};
		int b=a[0];
		for (int i=0;i<a.length;i++)

		{
			if (b<a[i]) 
			{
				b=a[i];
			}
			
		}
		
System.out.println("maxvalue is "+b);		
	}
	
	

}
