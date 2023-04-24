package LogicalProgram;

public class MultiplyTwoNumberWithoutUsingMultiplyOperator {

	public static void main(String[] args) {
		
		
		int num1=30;
		int num2=40;
		
		int sum=0;
		
		for (int i =0;i<num2;i++) {
			
			sum=sum+num1;
					
			
		}
		
		System.out.println("Result of 2 number multiplication :"+sum);
		int j=0;
		int sum2=0;
		while(j<num2)
		{
			sum2=sum2+num1;
			j++;
			
		}
		System.out.println(sum2);
	}

}
