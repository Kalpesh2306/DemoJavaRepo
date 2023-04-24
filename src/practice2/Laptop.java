package practice2;

public class Laptop {
	
	String ram;
	String harddisk;
	
	Laptop(String r,String h)
	{
		this.ram=r;
		this.harddisk=h;
		
	}

public boolean equals(Object var)
{
	Laptop l5=(Laptop)var;
	return this.harddisk==l5.harddisk;

}
}
