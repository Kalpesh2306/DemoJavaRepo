package LogicalProgram1;

import java.util.Scanner;

public class Example6_Factorial_of_Number {

	public static void main(String[] args) {
		
		System.out.println("Enter the number ");
		Scanner sc=new Scanner(System.in);
		
	int num=sc.nextInt();
	int fact=1;
	for(int i =num;i>0;i--)
	{
		
		fact=fact*i;
		
	}
		System.out.println("Factorial of "+num+" is :"+ fact);

	}

}
