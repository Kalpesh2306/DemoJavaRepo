//Prime Number : The number which divisible by itself only.
//ex:2,3,5,7,11,13,17,19,23 etc

package LogicalProgram1;

import java.util.Scanner;

public class Example9_Prime_Number {
	public static void main (String[] args)
	{
	for(int j=2;j<=100;j++) 
	{
		int count=0;
		for(int i=2;i<j;i++)
		{
			if (j%i==0)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("given number " +j+"is not prime ");
		}
		else
		{
			System.out.println("Given number"+j+" is prime");			
		}
		}
	}
}
