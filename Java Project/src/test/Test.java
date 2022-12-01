package test;

public class Test 
{
	int a,b,sum;
	public Test()
	{
		this(20);
		System.out.println("hellooooooo");
		
	}
	public Test(int a)
	{
		System.out.println("hi");
		//this.a=a;
	}
	public void display(int a,int b)
	{
		sum=a+b;
	}
	public void display1()
	{
		System.out.println("sum " +sum);
		this.display(10, 20);
	}
	public static void main(String[] args) 
	{
		Test obj=new Test(20);
		obj.display1();
		Test obj1=new Test();
		
	}

}
