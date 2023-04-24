package basicPrograms;

import java.util.Scanner;

public class Odd_And_Even_Number {

	public static  void mod(int a)
	{
		if (a%2==0)
		{
			System.out.println("number"+a+" is even Number");
		}
		else {
			System.out.println("number"+a+" is odd Number");
		}
		
	}
	//using or operator
	public static void bitwiseOr(int b)
	{
		if((b|1)>b)
		{
			System.out.println("number"+b+" is even Number");
		}
		else {
			System.out.println("number"+b+" is odd Number");
		}
	}
	public static void bitwiseAnd(int c)
	{
		if((c&1)==0)
		{
			System.out.println("number"+c+" is even Number");
		}
		else {
			System.out.println("number"+c+" is odd Number");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		mod(a);
		bitwiseOr(b);
		bitwiseAnd(c);

	}

}
