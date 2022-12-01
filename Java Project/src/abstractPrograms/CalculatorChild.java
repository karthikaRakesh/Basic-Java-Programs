package abstractPrograms;

public class CalculatorChild extends Calculator
{
	int ans;
	public void add(int a,int b)
	{
		ans=a+b;
		System.out.println("Sum= " +ans);
	}
	public void sub(int a,int b)
	{
		ans=a-b;
		System.out.println("Difference= " +ans);
	}
	public void mul(int a,int b)
	{
		ans=a*b;
		System.out.println("Multiplication= " +ans);
	}
	public void div(int a,int b)
	{
		ans=a/b;
		System.out.println("Division= " +ans);
	}
	public static void main(String[] args) 
	{
		CalculatorChild obj=new CalculatorChild();
		obj.add(2, 3);
		obj.sub(20,10);
		obj.mul(2, 3);
		obj.div(20, 2);
	}

}
