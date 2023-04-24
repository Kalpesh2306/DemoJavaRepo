
//Amstrong number : the number whos digit cube sum is same as original number.

package LogicalProgram1;

import java.util.Scanner;

public class Example7_Amstrong_Number {

	public static void main(String[] args)
	{
	System.out.println("Enter number ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0;
	
	for(int i=num;i>0;i=i/10)
	{
	int rem =i%10;
	sum=sum+(rem*rem*rem);
	}		
	if (num==sum) 
	{
		System.out.println("Giver number is amstrong number");
	}
	else {
		System.out.println("Number is not amstrong number");
	}
	}

}
