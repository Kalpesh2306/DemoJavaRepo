//Palindrom string :even if reverse the string it will remain same as original

package LogicalProgram1;

import java.util.Scanner;

public class Example4_Palindrom_String {

	public static void main(String[] args) {
		System.out.println("Enter the input");
		Scanner sc=new Scanner(System.in);
		String org=sc.next();
String rev="";
	
for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+org.charAt(i);
	}

if(org.equals(rev))
	{
	System.out.println("given String is palindrom");
	}
else
	{
	System.out.println("given String is not palindrom");
	}

}

}
