package basicPrograms;

public class AmstrongNumber {

	public static void main(String[] args) {
		int no=153;
		int t1=no;
		int length=0;
		while(t1!=0)
		{
			t1=t1/10;
			length=length+1;
		}
System.out.println(length);
		int t2=no;
		int rem;
		int amr=0;

		while(t2!=0)
		{
			int mul=1;
			rem=t2%10;
			for(int i=1;i<=length;i++)
			{
				mul=rem*mul;
			}
			t2=t2/10;
			amr=amr+mul;
			System.out.println("multiplcation number is :"+mul);
			System.out.println("amr number is :"+amr);
		}
		if(no==amr)
		{
			System.out.println(no+"number is amstrong number");
		}
		else {
			System.out.println(no+"number is not amstrong number");
		}
	}

}
