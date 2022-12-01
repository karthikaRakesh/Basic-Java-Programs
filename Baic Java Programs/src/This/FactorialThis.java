package This;

public class FactorialThis
{
	int i,fact=1;
	public void cal(int num)
	{
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
	}
	public void disp()
	{
		this.cal(5);
		System.out.println("Factorial = "+fact);	
	}

	public static void main(String[] args) 
	{
		FactorialThis obj=new FactorialThis();
		obj.disp();

	}

}
