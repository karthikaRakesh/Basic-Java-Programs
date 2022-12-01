package SuperPrograms;

public class SuperVar2Child extends SuperVar2
{
	public void add(int a,int b)
	{
		int a1=super.a;
		int b1=super.b;
		int sum1=a+b;
		int sum=a1+b1;
		System.out.println("Parent sum "+sum);
		System.out.println("Child sum= "+sum1);
		
	}
	public static void main(String[] args) 
	{
		SuperVar2Child obj=new SuperVar2Child();
		obj.add(20,30);

	}

}
