package LogicalProgram1;

public class Example13_Reverse_Middle_Substring_From_Given_String {

	public static void main(String[] args) {
		
		String str="washington";
		int half=(str.length()-1)/2;
		int quater=half+2;
		String output="";
		String rev="";
		String str2=str.substring(half,quater);
		for(int i=0;i<=str.length()-1;i++) 
		{
			if(i<half || i>)
			char ch=str.charAt(i);
			output=output+ch;
			if(i==half)
			{
				for(int j=str2.length()-1;j>=0;j--)
				{
						rev=rev+str2.charAt(j);
				
				}
					output=output+rev;
					
			}
		}
	System.out.println("Original String  :" +str);
	System.out.println("Substring is :"+str2);
	System.out.println(rev);
	System.out.println("String after reversing substring :"+output);
	
	}
		
		
 }

