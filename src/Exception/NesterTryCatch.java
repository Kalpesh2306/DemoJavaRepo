package Exception;

public class NesterTryCatch {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		String c="pune";
		try
		{
			try
			{
				System.out.println(c.charAt(4));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(b/a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
