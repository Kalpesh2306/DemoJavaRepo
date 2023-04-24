package Exception;

import java.util.Scanner;

public class ElectionCriteria {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if (age>=18)
		{
			System.out.println("voter age is :"+age);
			System.out.println("voter is eligible for voting ");
		}
		else
		{
			System.out.println("voter age is :"+age);
			throw new ArithmeticException("voter is not eligible for voting");
		}

	}

}
