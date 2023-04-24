package practice;

public class ControlTransferStatement {

	public static void main(String[] args) {
		
		
		int n=1;
		while (n<3)
		{
			for (int i=0;i<2;i++)
			{			
			System.out.println("hi");
			if(n==1)
			{
				System.out.println("bye");
				
				continue;
			}
			
			}
		n++;
		
	
		}
		
	}

}
