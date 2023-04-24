package Exception;

public class FinallyBlock {

	public static void main(String[] args)
	{

		try {
			int a=10;
			int b=5;
			int c=a/b;
			System.out.println(c);
			

		}
		finally {
			System.out.println("Finally block executed");

		}
	}
}
