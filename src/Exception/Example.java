package Exception;

public class Example {

	public static void main(String[] args) {
		try {
			char ch=s.charAt(10);
			System.out.println(ch);
		}
		catch(Exception  e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
	}

}
