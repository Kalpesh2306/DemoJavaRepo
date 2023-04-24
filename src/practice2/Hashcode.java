package practice2;

public class Hashcode {
	
	String ename;
	int empid;
	double esal;
	int pancard;
	
	Hashcode(String e,int i,double sal,int p){

		this.ename=e;
		this.empid=i;
		this.esal=sal;
		this.pancard=p;
		
	}

	public int hashCode()
	{
	
	return empid ;
	}
}
