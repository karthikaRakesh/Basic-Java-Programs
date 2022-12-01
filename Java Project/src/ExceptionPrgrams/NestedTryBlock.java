package ExceptionPrgrams;

public class NestedTryBlock 
{

	public static void main(String[] args) 
	{
		try //outer try block
		{
			try //inner try block 1
			{
				System.out.println("going to divide by zero");
				int b=4/0;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			try //inner try block 2
			{
				int a[]=new int[5];
				a[5]=4;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Other statements");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Handled the exception(outer block)");
		}
		System.out.println("Normal flow");
	}

}
