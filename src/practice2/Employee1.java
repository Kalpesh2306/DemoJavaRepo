package practice2;

public class Employee1 {
	
	String empId;
	String empName;
	private double empsal;
	
	Employee1(String eid,String ename,double esal)

	{
		this.empId=eid;
		this.empName=ename;
		this.empsal=esal;
	}
	public double getEmpsal()
	{
		return empsal;
	}
	
	public void  setEmpsal(double sal)
	{
		this.empsal=sal;
	}
	
	public void display()
	{
	System.out.println("emploee name is :"+this.empName);
	System.out.println("employee id is :"+this.empId);
	System.out.println("employee salary is :"+this.empsal);
	}
}
