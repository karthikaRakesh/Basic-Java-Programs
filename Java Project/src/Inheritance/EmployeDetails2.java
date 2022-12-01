package Inheritance;

public class EmployeDetails2 extends EmployeDetails
{
	public void details2(long basic,int hra)
	{
		System.out.println("Basic pay: " +basic);
		System.out.println("HRA:" +hra);
		long salary=basic+hra;
		System.out.println("Salary: " +salary);
		System.out.println("*********************************************************");
	}
	
	public static void main(String[] args) 
	{
		EmployeDetails2 obj=new EmployeDetails2();
		obj.details("Karthika Rakesh","Sofware Testing","1ES34543");
		obj.details2(55600,45679);
		EmployeDetails2 obj1=new EmployeDetails2();
		obj1.details("Riya Judin","Sofware Testing","3T45EDE5");
		obj1.details2(67890,1234);
		EmployeDetails2 obj2=new EmployeDetails2();
		obj2.details("Parvathy","Sofware Testing","234ERTYH");
		obj2.details2(23456,23453);

	}

}
