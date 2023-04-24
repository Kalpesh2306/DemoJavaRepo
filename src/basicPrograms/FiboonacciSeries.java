package basicPrograms;

public class FiboonacciSeries {

	public static void main(String[] args) {
		long a=0;
		long b=1;
		long c ;
		
	for(int i=1;i<=10;i++)
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}

	}

}
