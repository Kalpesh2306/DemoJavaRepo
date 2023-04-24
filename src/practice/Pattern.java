package practice;

public class Pattern {

	public static void main(String[] args) {
	
		System.out.println("=========================asending  star program==================");
		
		int m=5;
		for(int k=1;k<=m;k++)
		{
			for (int l=1;l<=k;l++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		System.out.println("=========================Decending  star program==================");
		System.out.println();
		int n=5;

		for (int i=1;i<=n;i++)
		{
			
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
				
			}	
			System.out.println();
		}
		System.out.println();
		
		System.out.println("=========================right angle   star program==================");
		
		int a=5;
		for (int b=1;b<=5;b++)
		{
			for (int c=4;c>=b;c--) 
			{
				System.out.print(" ");
				
			}
			for(int d=1;d<=b;d++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("=========================pyramid  star program==================");
		int e=5;
		for (int f=1;f<=e;f++)
		{
			for (int g=4;g>=f;g--) 
			{
				System.out.print(" ");
				
			}

			for(int h=1;h<=f;h++)
			{
				System.out.print("*");
				
			}
			for(int o=2;o<=f;o++)
			{
				System.out.print("*");
				
			}
			for(int p=5;p>=f;p--)
			{
				System.out.print(" ");
				
			}
			
			System.out.println();
		}
		
		
	}

}
