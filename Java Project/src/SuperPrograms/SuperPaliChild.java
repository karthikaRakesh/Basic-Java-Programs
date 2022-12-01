package SuperPrograms;

public class SuperPaliChild extends SuperRevParent
{
	public void calpali()
	{
		super.calrev(1234);
		if(temp == reverse)
		{
		System.out.println("The number is Paliadrom ");  	
		}	
		else
		{
		System.out.println("The number is not Paliadrom");  
		} 
	}
	public static void main(String[] args) 
	{
		SuperPaliChild obj=new SuperPaliChild();
		obj.calpali();
	}

}
