package ExceptionPrgrams;

public class MultipleCatch 
{

	public static void main(String[] args)
	{
		try
		{    
            int a[]=new int[5];    
            a[7]=4/6;          
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception occurs");  
			System.out.println(e);
		}    
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
			System.out.println(e);
		}
		finally
		{
			int a=2,b=3,sum;
			sum=a+b;
			System.out.println(sum);
		}

	}

}
