package LogicalProgram1;

public class Example10_Reverse_Number_Approach1 {

	public static void main(String[] args) {
		
		int a=123456789;
		String s=String.valueOf(a); //-------->PDT to non PDT
		
		//here we use ValueOf() static method of string class to convert PDT to non Primitive 
		// we can use toString() static method of Wrapper class to convert PDT to non PDT.
		
		//ex: String s=Integer.toString(a);
		
		
		String rev="";
		for (int i =s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		int revNum=Integer.parseInt(rev);// convert non PDT to PDT
		
		System.out.println(a);
		System.out.println(revNum);
	}

}
