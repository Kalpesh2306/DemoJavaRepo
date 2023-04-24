package practice2;

public class ContinueExample1 {

	public static void main(String[] args) {
		
		int n=1;
		while(n<3)
		{
		for (int i=0;i<2;i++)
		{
			System.out.println("hi");
			if(i==1)
			{
				System.out.println("bye");
					continue;
			}
		}
		n++;
		}
		System.out.println("go corona go");
	}
}
