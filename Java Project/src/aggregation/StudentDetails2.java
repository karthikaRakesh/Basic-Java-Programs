package aggregation;

public class StudentDetails2 
{
	String id,name;
	StudentAddress1 adre;
	public void details(String id,String name,StudentAddress1 adr)
	{
		this.id=id;
		this.name=name;
		this.adre=adr;
	}
	public void disp()
	{
		System.out.println("Name: " +name);
		System.out.println("id: " +id);
		System.out.println("Address Line 1: " +adre.addline1);
		System.out.println("Address Line 2: " +adre.addline2);
		System.out.println("Street: " +adre.street);
		System.out.println("Pincode: " +adre.pincode);
		System.out.println("************************************************");
	
	}
	public static void main(String args[])
	{
		StudentAddress1 obj1=new StudentAddress1();
		obj1.address("Nandanam","Athanilane","Vanchiyoor",695035);
		StudentDetails2 obj2=new StudentDetails2();
		obj2.details("12e3f", "Karthika", obj1);
		obj2.disp();
		
		StudentAddress1 obj3=new StudentAddress1();
		obj3.address("mj Astro","e-city","bangalore",690003);
		StudentDetails2 obj4=new StudentDetails2();
		obj4.details("R1232", "Riya", obj3);
		obj4.disp();
		
		
	}
}
