package LogicalProgram1;

import java.util.Scanner;

public class Example3_Reverse_String {

	public static void main(String[] args) {

		System.out.println("Enter input");
		Scanner sc=new Scanner(System.in);
		String orignal=sc.next();
		String reverse="";
		
		for (int i=orignal.length()-1;i>=0;i--) 
		{
			reverse=reverse+orignal.charAt(i);
			
		}
		
		System.out.println("Orignal String is :"+orignal);
		System.out.println("Reverse String is :"+reverse);
		
	}

}

