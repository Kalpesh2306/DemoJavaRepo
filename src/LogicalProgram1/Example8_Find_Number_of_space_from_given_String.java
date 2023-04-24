package LogicalProgram1;

import java.util.Scanner;

public class Example8_Find_Number_of_space_from_given_String {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();

		int temp=0;
		
		for(int i=0; i<=input.length() -1;i++)
		{
			char ch=input.charAt(i);
			if(ch==' ')
			{
				temp++;
			
				
			}
			
		}
		System.out.println("Number of spaces in given string are :" +temp);
		
	}

}
