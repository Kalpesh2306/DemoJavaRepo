package LogicalProgram1;

public class Example14_Duplicate_Character_In_ContString_WitoutUsing_HashMap {

	public static void main(String[] args) {
	String str="abcabcaaad";
	for(int i =0;i<=str.length()-1;i++)
	{
		int count=0;
		char ch=str.charAt(i);
		for(int j=1;j<=str.length()-1;j++)
		{
			if(ch==str.charAt(j))
			{
				count++;
						
			}
		}
		System.out.println("Character "+ch+"present "+count+" times in given string");
		
		
	}
		
		

	}

}
