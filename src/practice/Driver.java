package practice;

public class Driver {

	public static void main(String[] args) {
	
	City c=	new City();
	c.count();
	c.festival();
	c.weather();
	
	//upcating 
	
	System.out.println("=============Upcasting from city to state========================================================");
State s=c;
s.festival();
s.count();
//s.weather();          ==================CTE=====================
System.out.println("=======================Updateing from State to Country==============================================");


Country c1=s;

c1.count();
// c1.festival();   ==================CTE=====================
// c1.weather();    =====================CTE=====================

System.out.println("=============Downcasting from country to state========================================================");

State S1=(State)c1;
S1.count();
S1.festival();
// S1.weather();       =====================CTE=====================

System.out.println("=============Downcasting from state  to city========================================================");

City C1=(City)S1;
C1.count();
C1.festival();
C1.weather();

	}
	

}
