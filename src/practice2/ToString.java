package practice2;

public class ToString {
	
	String ename;
	String empId;
	double esal;
	
	ToString (String e,String i,double sal)
	{
		this.ename=e;
		this.empId=i;
		this.esal=sal;
	}
	ToString()
	{
		
	}
	public String toString()
	{
		return "INF"+this.empId;
	}
}
