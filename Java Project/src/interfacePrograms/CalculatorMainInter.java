package interfacePrograms;

public class CalculatorMainInter implements Calculator,Calculator2
{
	int ans;
	public void add(int a,int b)
	{
		ans=a+b;
		System.out.println("Sum: "+ans);
	}
	public void sub(int a,int b)
	{
		ans=a-b;
		System.out.println("Difference: "+ans);
	}
	public void mul(int a,int b)
	{
		ans=a*b;
		System.out.println("Multiplication: "+ans);
	}
	public void div(int a,int b)
	{
		ans=a/b;
		System.out.println("Division: "+ans);
	}
	public static void main(String[] args)
	{
		CalculatorMainInter obj=new CalculatorMainInter();
		obj.add(3, 10);
		obj.sub(20, 10);
		obj.mul(20, 10);
		obj.div(20,10);
		

	}

}
