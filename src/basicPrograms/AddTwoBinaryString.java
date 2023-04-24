package basicPrograms;

public class AddTwoBinaryString {

	public static void main(String[] args) {		
		String x="11011";
		String y="11100";
		int num1=Integer.parseInt(x,2);
		//convert binary string 2 integer
		int num2=Integer.parseInt(y,2);
		int sum=num1+num2;
		
		//convert back to binary string
		
		String result=Integer.toBinaryString(sum);
		System.out.println(x);
		System.out.println(y);
		System.out.println("Sum of binary string x and y is :"+sum);
	}

}
