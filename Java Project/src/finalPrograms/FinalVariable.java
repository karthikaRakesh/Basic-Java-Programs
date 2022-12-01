package finalPrograms;

public class FinalVariable 
{
	final int a=10;
	public void disp()
	{
		//a=15;//can't change the value of final variable
		System.out.println("a= " +a);
	}
	public static void main(String[] args) 
	{
		FinalVariable obj=new FinalVariable();
		obj.disp();	
	}

}
