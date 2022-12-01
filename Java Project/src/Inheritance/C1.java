package Inheritance;

public class C1 extends P1
{
	public void display()
	{
		System.out.println("I am a child class");
	}
	public static void main(String[] args) 
	{
		C1 obj=new C1();
		obj.print();
		obj.display();
	}
}
