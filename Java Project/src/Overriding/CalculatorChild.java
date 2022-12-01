package Overriding;

public class CalculatorChild extends Calculator
{
	int ans;
	public void add(int a, int b)
	{
		ans=a+b;
		System.out.println("Child addition= " +ans);
	}
	public void sub(int x, int y)
	{
		ans=x-y;
		System.out.println("Child subtraction= " +ans);
	}
	public void mul(int a, int b)
	{
		ans=a*b;
		System.out.println("Child Multiplication= " +ans);
	}
	public static void main(String[] args) 
	{
		CalculatorChild obj=new CalculatorChild();
		obj.add(122,134);
		obj.sub(122,20);
		obj.mul(20,30);
	}

}
