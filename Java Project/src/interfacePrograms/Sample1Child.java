package interfacePrograms;

public class Sample1Child implements Sample1 
{
	public void disp()
	{
		System.out.println("i am a child");
	}
	public static void main(String[] args) 
	{
		Sample1Child obj=new Sample1Child();
		obj.disp();

	}

}
