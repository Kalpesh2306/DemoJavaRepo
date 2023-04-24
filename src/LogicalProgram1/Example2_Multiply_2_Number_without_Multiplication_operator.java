package LogicalProgram1;

import java.util.Scanner;

public class Example2_Multiply_2_Number_without_Multiplication_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please enter number ");	
Scanner sc=	new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
long sum=0;

for(int i=0;i<num2;i++)
	{
		sum=sum+num1;
	}

System.out.println("Multiplication on 2 number is "+sum);
	}

}
