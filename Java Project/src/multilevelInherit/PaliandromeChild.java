package multilevelInherit;

public class PaliandromeChild extends ReverseChild 
{
	public void calpali()
	{
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
		PaliandromeChild obj=new PaliandromeChild();
		obj.calrev(121);
		obj.calpali();
		obj.calfac(5);
		

	}

}
