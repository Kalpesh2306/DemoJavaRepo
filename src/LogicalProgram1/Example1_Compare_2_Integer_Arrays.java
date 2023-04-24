package LogicalProgram1;

import java.util.Arrays;

public class Example1_Compare_2_Integer_Arrays {

	/*How to compare two integer arrays?
	
	Ans : first we have to declare arrays reference variable.
		then we have to use predefined class of java i.e arrays class.
		and its equals method(return type is boolean).
	*/
	
	public static void main(String[] args) {
		 int arr1[]= {10,20,30};
		 int arr2[]= {20,40,60};
		 int arr3[]= {10,20,30};
		 
		 System.out.println(Arrays.equals(arr1, arr2));
		 System.out.println(Arrays.equals(arr2,arr3));
		 System.out.println(Arrays.equals(arr1,arr3 ));
	}

}
