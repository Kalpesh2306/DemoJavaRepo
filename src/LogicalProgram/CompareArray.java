package LogicalProgram;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		
		int [] A1= {10,20,30};
		int  [] A2= {40,50,60};
		int [] A3= {40,50,60};
		
		System.out.println(Arrays.equals(A1, A2));
		System.out.println(Arrays.equals(A1, A3));
		System.out.println(Arrays.equals(A2,A3));
	}

}
