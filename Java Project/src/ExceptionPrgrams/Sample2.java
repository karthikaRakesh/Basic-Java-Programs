package ExceptionPrgrams;

public class Sample2
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
				
					sum=a+b;
					System.out.println("Finally block" +sum);
		}
}
