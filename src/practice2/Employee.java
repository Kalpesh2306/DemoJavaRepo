package practice2;

public class Employee {
	
	String ename;
	String empid;
	
	
	Employee(String e,String i)
	{
		ename=e;
		empid=i;
		
	}
public String toString() {
	
	return "Employee name : "+ename +" employee id is : "+empid;
}
}

