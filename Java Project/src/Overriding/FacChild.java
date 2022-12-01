package Overriding;

public class FacChild extends FacParent
{
	public void calfac(int num)
	{
		super.calfac(5);
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+ num +" = "+fact);
	}
	
	public static void main(String[] args) 
	{
		FacChild obj=new FacChild();
		obj.calfac(8);
	}

}
