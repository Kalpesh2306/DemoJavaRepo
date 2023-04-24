package practice;

public class Driver1 {

	public static void main(String[] args) {
		A4 obj=new A4("TCS123456","kalpesh",25000.0);
		
double sal=obj.getEmpSal();
System.out.println(sal);

obj.setEmpSal(30000);
System.out.println(obj.getEmpSal());
	}

}
