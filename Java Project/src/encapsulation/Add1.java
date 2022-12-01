package encapsulation;

public class Add1 
{
	private double a,b,c,sum;
	public void setAdd(double a,double b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double getAdd()
	{
		sum=a+b+c;
		System.out.println(sum);
		return sum;
	}

}
