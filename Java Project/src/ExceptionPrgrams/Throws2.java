package ExceptionPrgrams;

public class Throws2 
{
	public void division() throws ArithmeticException
	{
		int ans2=12+12;
		System.out.println(ans2);
		
		int ans=12/0;
		System.out.println(ans);
		int ans1=12+12;
		System.out.println(ans1);
	}

	public static void main(String[] args) 
	{
		Throws2 obj=new Throws2();
		obj.division();

	}

}
