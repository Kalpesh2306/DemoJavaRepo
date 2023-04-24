package basicPrograms;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		//App 1:using third veriable temp
		
		int a =5;
		int b=10;
		int temp;
		temp =b;
		b=a;
		a=temp;
		
		System.out.println(a);
		System.out.println(b);
		
		//approach2 :using sum and difference concept
		
		int c=15;
		int d=6;
		
		c=c-d;
		d=d+c;
		c=d-c;
		
		System.out.println(c);
		System.out.println(d);
		
		//apporach 3:using bitwise operator 
		/* it is use to peform xor function on the binary value of any number;
		 ^ XOR Operator
		*/
	
		int m=12;
		int n=16;
		
		m=m^n;
		n=m^n;
		m=m^n;
		
		System.out.println(m);
		System.out.println(n);
		
	}

}
