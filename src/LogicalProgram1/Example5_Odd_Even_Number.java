package LogicalProgram1;

import java.util.Scanner;

public class Example5_Odd_Even_Number {

	public static void main(String[] args) {
		
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if (num%2==0)
		{
			System.out.println("Given number is even");
		}
		
		else 
		{
			System.out.println("Given number is odd");
		}
		
		
		
	}

}
