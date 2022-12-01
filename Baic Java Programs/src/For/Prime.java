package For;

public class Prime 
{
	public static void main(String[] args) 
	{
		int i,a=0,n=11;
		for(i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				a=a+1;
			}
		}
		//System.out.println(a);
		if(a>0)
		{
			System.out.println("Not a prime");
		}
		else
		{
			System.out.println("Prime");
		}
	}


}

