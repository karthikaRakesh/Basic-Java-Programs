package multilevelInherit;

public class FactorialParent
{
	int i,fact=1;
	public void calfac(int num)
	{
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+ num +" = "+fact);
	}
	

}
