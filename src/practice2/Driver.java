package practice2;

public class Driver {

	public static void main(String[] args) {
	Employee1 obj=new Employee1("1807552","kalpesh",50000);
	obj.display();
	System.out.println(obj.empName);
	System.out.println(obj.getEmpsal());
	obj.empName="ganesh";
	obj.setEmpsal(600000);
	obj.display();
	}

}
