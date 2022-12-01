package Overriding;

public class Calculator 
{
	int ans;
	public void add(int a,int b)
	{
		ans=a+b;
		System.out.println("Parent addition=" +ans);
	}
	public void sub(int x,int y)
	{
		ans=x+y;
		System.out.println("Parent subtraction= "+ans);
	}
}
