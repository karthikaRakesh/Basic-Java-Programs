package abstractPrograms;

public class Sample2Child extends Sample2
{
	public void disp() 
	{
		System.out.println("hi");
		
	}

	public void print() 
	{
		System.out.println("hello");
	}
	public static void main(String[] args) 
	{
		Sample2Child obj=new Sample2Child();
		obj.disp();
		obj.print();

	}

	

}
