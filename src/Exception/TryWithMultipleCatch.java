package Exception;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		System.out.println("Main method start here");
		String s="hi hello ";

		try {
			char ch=s.charAt(10);
			System.out.println(ch);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("main method ends here ");
	}

}
