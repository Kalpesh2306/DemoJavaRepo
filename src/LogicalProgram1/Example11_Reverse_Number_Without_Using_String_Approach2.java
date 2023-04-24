package LogicalProgram1;

public class Example11_Reverse_Number_Without_Using_String_Approach2 {

	public static void main(String[] args) {
	
		int a=11234567;
		
		int revNum=0;
		for(int i=a;i>0;i=i/10)
		{
			int rev=i%10;
			revNum=revNum*10+rev;			
		}
		System.out.println(a);
		System.out.println(revNum);

	}

}
