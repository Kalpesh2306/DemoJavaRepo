package LogicalProgram1;

public class Example12_Reverse_Odd_String_From_Given_String {

	public static String reverseString(String input)
	{
		String  rev="";
		for(int j=input.length()-1;j>=0;j--)
		{
			rev=rev+input.charAt(j);
		}			
		return rev;
	}
	
	public static void main(String[] args) {
		String output="";
		
		String str="abc def ghi jkl mno pqr";
		
		String[] arr=str.split(" ");//{abc def ghi jkl mno pqr}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2!=0)
			{
				String str1=arr[i];
				arr[i]=reverseString(str1);
			}	
		}
		
		for(int k=0;k<=arr.length-1;k++)
		{
			output=output+arr[k]+" ";
		}
		System.out.println("Original String is :"+str);
		System.out.println("Reverse Odd String is :"+output);
		
	}

}
