package basicPrograms;

public class LeapYear {

	public static void main(String[] args) {
		
for(int year=2000;year<=3000;year++)
{
		if (year%4==0)
		{
			if (year%100==0)
			{
				if(year%400==0)
				{
					System.out.println(year+ " is leap year .");
				}
				else
				{
					System.out.println(year+ " is not leap year .");
				}
			}
			else {
				System.out.println(year+ " is leap year .");
			}
		}
		else
		{
			System.out.println(year+ " is not leap year .");
		}
}	
}
	
}
