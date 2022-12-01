package SuperPrograms;

public class SuperVar1Child extends SuperVar1
{
	public void disp()
	{
		System.out.println("Parent variable :" +super.a);
	}

	public static void main(String[] args) 
	{
		SuperVar1Child obj=new SuperVar1Child();
		obj.disp();
	}

}
