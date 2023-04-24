package practice2;

public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Maximum number
		
		int a[]= {10,20,30,40,44,44,55,9,8,2};
		int b=a[0];
		int c=a[1];
		for (int i=2;i<a.length;i++)
		{
			if(b<=c)
			{
				b=c;
				c=a[i];
			}
			
			
		}
		System.out.println("highest number is "+b);
	}

}
