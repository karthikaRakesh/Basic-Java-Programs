package Overriding;

public class FacParent 
{
	int fact=1;
		public void calfac(int num)
		{
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+ num +" = "+fact);
		}
}
