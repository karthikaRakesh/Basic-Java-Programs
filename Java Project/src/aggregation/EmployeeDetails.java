package aggregation;

public class EmployeeDetails 
{
	String id,name,department;
	long salary;
	EmployeeAddress adr;
	public void details(String id,String name,String dep,long sal,EmployeeAddress adr)
	{
		this.id=id;
		this.name=name;
		this.department=dep;
		this.salary=sal;
		this.adr=adr;
	}
	public void display()
	{
		System.out.println("Name : " +name);
		System.out.println("ID : "+id);
		System.out.println("Depatment : " +department);
		System.out.println("Salary : " +salary);
		System.out.println("Address Line 1: " +adr.addressL1);
		System.out.println("Address Line 2: " +adr.addressL2);
		System.out.println("Street: " +adr.street);
		System.out.println("District: " +adr.dist);
		System.out.println("Pincode: " +adr.pin);
		System.out.println("**********************************************");
	}
	public static void main(String[] args) 
	{
		EmployeeAddress obj=new EmployeeAddress();
		obj.address("Nandanam", "Athani lane", "Vanchiyoor", "Trivandrum", 695035);
		EmployeeDetails obj1=new EmployeeDetails();
		obj1.details("Karthika", "K1324", "EEE", 1235777, obj);
		obj1.display();
		
		EmployeeAddress obj2=new EmployeeAddress();
		obj2.address("AAAAAnd", "djfhug lane", "tjgjhf", "Trivandrum", 695035);
		EmployeeDetails obj3=new EmployeeDetails();
		obj3.details("Parvathy", "P1324", "CSE", 2235777, obj2);
		obj3.display();
		
		EmployeeAddress obj4=new EmployeeAddress();
		obj4.address("AAAAAnd", "djfhug lane", "tjgjhf", "Trivandrum", 695035);
		EmployeeDetails obj5=new EmployeeDetails();
		obj5.details("riya", "P1324", "CSE", 2235777, obj4);
		obj5.display();
	}

}
