package aggregation;

public class StudentDetAsgn2 
{
	String addLine1,addLine2,addLine3,street,dist;
	int pin;
	StudentDetAsgn stu;
	public void details2(String addLine1,String addLine2,String addLine3,String street,String dist,int pin,StudentDetAsgn stu)
	{
		this.addLine1=addLine1;
		this.addLine2=addLine2;
		this.addLine3=addLine3;
		this.street=street;
		this.dist=dist;
		this.pin=pin;
		this.stu=stu;
	}
	public void display()
	{
		System.out.println("Students Details");
		System.out.println("-----------------------");
		System.out.println("Name of Student: " +stu.name);
		System.out.println("ID Number : " +stu.id);
		System.out.println("Address line 1 : " +addLine1);
		System.out.println("Address line 2 : " +addLine2);
		System.out.println("Address line 3 : " +addLine3);
		System.out.println("Street : " +street);
		System.out.println("District : "+dist);
		
	}
	public static void main(String[] args) 
	{
		StudentDetAsgn obj=new StudentDetAsgn();
		obj.details("1CHLKG","Advaith R Bhaskar" );
		StudentDetAsgn2 obj1=new StudentDetAsgn2();
		obj1.details2("Nandanam", "ARA21", "AthaniLane", "Vanchiyoor", "Trivandrum", 695035, obj);
		obj1.display();

	}

}
