package ExceptionPrgrams;

public class Sample1
{
	public static void main(String[] args) 
	{
		int a=12,b=13,sum,div;
		try
		{
			div=45/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally // if not given it will also work. finally is given it must execute the code
		{
			sum=a+b;
			System.out.println("Finally block" +sum);
		}
	}

}
