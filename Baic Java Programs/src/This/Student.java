package This;

public class Student 
{
	int rollno;
	String name;
	float fee;
	public Student(String name1, int rollno1,float fee1)
	{
		this.rollno=rollno1;
		this.name=name1;
		this.fee=fee1;
	}
	public void display()
	{
		System.out.println("Name:" +name);
		System.out.println("Roll Number:" +rollno);
		System.out.println("Fee:" +fee);
	}

	public static void main(String[] args) 
	{
		Student obj=new Student("karthika",123,1000.2f);
		obj.display();
		

	}

}
