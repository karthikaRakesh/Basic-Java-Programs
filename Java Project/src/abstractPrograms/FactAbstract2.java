package abstractPrograms;

public class FactAbstract2 extends FactAbstract
{
	int i,fact=1;
	public void cal(int num)
	{
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+ num +" = "+fact);
	}
	public static void main(String[] args) 
	{
		FactAbstract2 obj=new FactAbstract2();
		obj.cal(5);

	}

}
