package SuperPrograms;

public class ReverseConstructor2 extends ReverseConstructor
{
	public ReverseConstructor2()
	{	
		super(12345);
		System.out.println("The reverse of the given number is: " + reverse);  		 
	}
	public static void main(String[] args)
	{
		
		ReverseConstructor2 obj=new ReverseConstructor2();
	}

}
