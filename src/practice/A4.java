package practice;

public class A4 {

	String empId;
	String empName;
	private double empSal;
	
	A4(String eid,String ename,double salary)
	{
		this.empId=eid;
		this.empName=ename;
		this.empSal=salary;
	}
	public void demo()
	{
		
		System.out.println("Emloyee Name is :" +this.empName);
		System.out.println("Emloyee ID is :" +this.empId);
		System.out.println("Emloyee Salary  is :" +this.empSal);


	}
	public double getEmpSal()
	{
		return empSal;		
	}
	public void setEmpSal(double sal)
	{
		this.empSal=sal;
	}

}
